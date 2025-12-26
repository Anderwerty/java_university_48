package module1.lesson22;

public class Example1 {
    public static void main(String[] args) throws MyException2 {
        throw new MyException2();
    }


    public static void validate(UserRegistrationRequest  registrationRequest){
        if(registrationRequest == null ){
            throw new IllegalArgumentException("1).....");
        }
        if(registrationRequest.getLogin()==null
                || registrationRequest.getPassword() == null
                || registrationRequest.getRepeatedPassword()==null){
            throw new IllegalArgumentException("2)....");
        }
        validateLogin(registrationRequest.getLogin());
        if(!registrationRequest.getPassword().equals(registrationRequest.getRepeatedPassword())){
            throw new IllegalArgumentException("3)....");
        }
        validatePassword(registrationRequest.getPassword());
    }

    private static void validatePassword(String password) {

    }

    private static void validateLogin(String login) {
        //.....
    }
}

class UserRegistrationRequest{
    private String login;
    private String password;

    private String repeatedPassword;

    public UserRegistrationRequest(String login, String password,
                                   String repeatedPassword){
        this.login = login;
        this.password = password;
        this.repeatedPassword = repeatedPassword;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getRepeatedPassword(){
        return this.repeatedPassword;
    }
}

class MyException1 extends Throwable {

}

class MyException2 extends Exception {

}
