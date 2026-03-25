package module2.lesson17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Example3 {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        System.out.println("Static Proxy");
        UserServiceLogger userServiceLogger = new UserServiceLogger(userService);
        User byId = userServiceLogger.getById(123);
        System.out.println(byId);


        System.out.println("Dynamic Proxy");
        UserService proxy = (UserService)Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class<?>[]{UserService.class},
                new GeneralLoggerHandler(userService));

        System.out.println(proxy.getById(1234));

//        ProductService proxy2 = (ProductService)Proxy.newProxyInstance(
//                ProductService.class.getClassLoader(),
//                new Class<?>[]{ProductService.class},
//                new GeneralLoggerHandler(productService));
    }
}

record User(int id) {

}

interface UserService {
    User getById(int id);
}

class UserServiceImpl implements UserService {
    @Override
    public User getById(int id) {
        return new User(id);
    }
}

class UserServiceLogger implements UserService {
    private final UserService userService;

    UserServiceLogger(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getById(int id) {
        long start = System.currentTimeMillis();
        waitMillis(1_000);
        User user = userService.getById(id);
        long end = System.currentTimeMillis();
        System.out.println("Time to execute: " + (end - start) + "ms.");
        return user;
    }

    private static void waitMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class GeneralLoggerHandler<T> implements InvocationHandler {

    private final T source;

    GeneralLoggerHandler(T source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();
        Thread.sleep(1_000);

        Object result = method.invoke(source, args);
        long end = System.currentTimeMillis();
        System.out.println("Time to execute: " + (end - start) + "ms.");
        return result;
    }
}