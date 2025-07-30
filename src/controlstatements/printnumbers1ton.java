package controlstatements;
import java.util.Scanner;

public class printnumbers1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
