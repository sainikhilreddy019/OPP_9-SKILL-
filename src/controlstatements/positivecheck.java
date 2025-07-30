package controlstatements;


import java.util.Scanner;

public class positivecheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println("n is positive ");
		}
		else
		{
			System.out.println("n is negative ");
		}

}
}