package class_assignments;

import java.util.Scanner;

public class EvenOrOddUsingBitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check odd/even: ");
		int a=sc.nextInt();
		if((a & 1)==1) {
			System.out.println("It is odd Number");
		}
		else {
			System.out.println("It is even number");
		}
	}

}
