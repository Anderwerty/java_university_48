package module2.lesson18;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) throws Exception {
        ThreadLocal<Credential> securityContext = new ThreadLocal<>();
        securityContext.set(new Credential(Set.of(Role.USER, Role.MANAGER)));

        Method method = Example2.class.getDeclaredMethod("printSecret");
        executeWithSecurity(securityContext, method);
    }

    // just for static method
    public static void executeWithSecurity(ThreadLocal<Credential> securityContext,Method method, Object... args) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);

        Set<Role> userRoles = Optional.ofNullable(securityContext.get())
                .map(Credential::getRoles)
                .orElse(Set.of());

        if(method.isAnnotationPresent(Security.class)){
            Security annotation = method.getAnnotation(Security.class);
            Role roleFromAnnotation = annotation.role();

            if(userRoles.contains(roleFromAnnotation)) {
                method.invoke(null, args);
            } else {
                throw new RuntimeException("Access denied");
            }

        } else {
            throw new RuntimeException();
        }
    }

    @Security(role = Role.MANAGER)
    public static void printSecret() {
        System.out.println("Password: ....");
    }


    @Security
    public static  void print(){

    }
}

/**
 *
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Security {
    Role role() default Role.USER;
}

enum Role {
    USER, MANAGER, ADMIN
}

class Credential {
    private final Set<Role> roles;

    Credential(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}