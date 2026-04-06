package module2.faculativ2;

import com.sun.jdi.InvocationException;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void runTest(Class<?> aClass) {
        //1. constructor without parameters
        //2. methods should be annotated with annotation @Test
        //3. methods without parameters
        //4. add annotation @BeforeEach
        //5. HW: add @AfterEach, quite same to 4)
        //6. HW: add @BeforeAll and @AfterAll --- methods should be in static context
        //7. HW: clean up and clarify messages
        //8. HW: implement timeout functionality

        Object object = createInstance(aClass);
        Method[] allMethods = aClass.getDeclaredMethods();
        List<Method> testMethods = findMethodsMarkedWithAnnotation(allMethods, Test.class);
        List<Method> beforeEachMethods = findMethodsMarkedWithAnnotation(allMethods, BeforeEach.class);

        testMethods.forEach(mt -> {
            beforeEachMethods.forEach(bm -> executeMethod(object, bm));
            System.out.println("Execute: " + mt.getName());
            try {
                executeMethod(object, mt);
            } catch (Exception e) {
                Throwable cause1 = e.getCause();
                if (cause1 instanceof InvocationTargetException invocationException) {
                    Throwable cause2 = invocationException.getCause();
                    if (cause2 instanceof AssertionException ae) {
                        System.err.println("Assertion error, actual: " + ae.getActual() + ", expected: " + ae.getExpected() + ", error message: " + ae.getMessage());
                    }
                } else {
                    throw e;
                }
            }
            System.out.println();
        });

    }

    private static Object createInstance(Class<?> aClass) {
        try {
            return aClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("java:S3011")
    private static void executeMethod(Object object, Method method) {
        method.setAccessible(true);
        try {
            method.invoke(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Method> findMethodsMarkedWithAnnotation(Method[] allMethods,
                                                                Class<? extends Annotation> testClass) {

        List<Method> methods = new ArrayList<>();
        for (Method method : allMethods) {
            if (method.isAnnotationPresent(testClass)) {
                methods.add(method);
            }
        }

        return methods;
    }
}
