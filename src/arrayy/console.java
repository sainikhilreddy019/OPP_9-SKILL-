package arrayy;
import java.util.Scanner;
public class console {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();  
        int[] arr = new int[n]; 
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("entered:");
        for(int i = 0; i < n; i++) 
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}