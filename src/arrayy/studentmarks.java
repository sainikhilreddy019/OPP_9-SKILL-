package arrayy;
import java.util.Scanner;
public class studentmarks {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] marks = new int[6]; 
	        int total = 0;
	        System.out.println("Enter marks for 6 subjects:");
	        for (int i = 0; i < 6; i++) 
	        {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = sc.nextInt();      
	            total += marks[i];           
	        }
	        System.out.println("\nSubject Marks:");
	        for (int i = 0; i < 6; i++) 
	        {
	            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
	        }
	        double average = total / 6.0;
	        System.out.println("\nTotal Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        sc.close();
	    }
}
