import java.util.Scanner;

public class Login {
    private static String userName = "qsj";
    private static String password = "123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String psw = scanner.next();
        try {
            login(name,psw);
        } catch (UserError | PasswordError userError) {
            userError.printStackTrace();
        }
    }

    private static void login(String userName, String password) throws UserError, PasswordError {
        if(!userName.equals("qsj")){
            throw new UserError("用户名错误");
        }
        if(!password.equals("123")){
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }

}
class UserError extends Exception{
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception{
    public PasswordError(String message) {
        super(message);
    }
}
