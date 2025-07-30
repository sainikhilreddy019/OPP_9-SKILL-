package controlstatements;
import java.util.Scanner;

public class userenters0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextInt();
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);

        System.out.println("Program ended.");
    }
}
