
import java.util.Scanner;

public class CombinedCharCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Geli xaraf (n = stop): ");
            input = scanner.next().charAt(0);

            if (input == 'n') {
                System.out.println("Barnaamijka wuu istaagay.");
            } else if (input == 'x' || input == 'y' || input == 'z') {
                System.out.println("Xaraf sax ah ✅: " + input);
            } else {
                System.out.println("Xaraf invalid ah ❌");
            }

        } while (input != 'n');
    }
}
