
import java.util.Scanner;

public class ValidCharCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geli xaraf (x, y, z kaliya): ");
        char letter = scanner.next().charAt(0);

        if (letter == 'x' || letter == 'y' || letter == 'z') {
            System.out.println("Xarafka waa sax: " + letter);
        } else {
            System.out.println("Xarafka waa invalid ❌");
        }
    }
}
