
import java.util.Scanner;

public class CharStopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Geli xaraf (n = stop): ");
            input = scanner.next().charAt(0);

            if (input != 'n') {
                System.out.println("Waxaad gelisay: " + input);
            }

        } while (input != 'n');

        System.out.println("Barnaamijku wuu istaagay sababtoo ah 'n' ayaa la geliyey.");
    }
}
