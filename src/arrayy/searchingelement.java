package arrayy;
import java.util.Scanner;
public class searchingelement {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) 
        {
            if (num == search) 
            {
                found = true;
                break;
            }
        }
        System.out.println(search + (found ? " is found." : " is not found."));
        sc.close();
    }
}