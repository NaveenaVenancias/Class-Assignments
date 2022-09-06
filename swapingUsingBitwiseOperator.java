package class_assignments;

import java.util.Scanner;

public class swapingUsingBitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		swap(a,b);
	}
	public static void swap(int x,int y) {
		x=x^y; 
		y=x^y;
		x=x^y;
		System.out.println("a= "+x);
		System.out.println("b= "+y);
	}
}
