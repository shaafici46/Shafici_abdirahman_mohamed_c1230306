
import java.util.Scanner;

public class PasswordValidator {

    public static boolean hasUpperCase(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean hasLowerCase(String password) {
        return password.matches(".*[a-z].*");
    }

    public static boolean hasDigit(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean hasSpecialChar(String password) {
        return password.matches(".*[!@#$%^&*()_+=<>?/{}~`].*");
    }

    public static boolean isLongEnough(String password) {
        return password.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geli password-ka: ");
        String password = scanner.nextLine();

        boolean valid = isLongEnough(password) && hasUpperCase(password) &&
                        hasLowerCase(password) && hasDigit(password) && hasSpecialChar(password);

        if (valid) {
            System.out.println("Password-kaagu waa mid adag ✅");
        } else {
            System.out.println("Password-kaagu waa daciif ❌");
            if (!isLongEnough(password)) System.out.println("- Waa inuu ka bato 8 xaraf");
            if (!hasUpperCase(password)) System.out.println("- Waa inuu leeyahay xaraf waaweyn (A-Z)");
            if (!hasLowerCase(password)) System.out.println("- Waa inuu leeyahay xaraf yaryar (a-z)");
            if (!hasDigit(password)) System.out.println("- Waa inuu leeyahay tirooyin (0-9)");
            if (!hasSpecialChar(password)) System.out.println("- Waa inuu leeyahay calaamado khaas ah (@,#,$,...)");
        }
    }
}
