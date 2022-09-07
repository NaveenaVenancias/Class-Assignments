package class_assignments;

import java.util.Scanner;

public class printingParticularValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value:");
		int sv=sc.nextInt();
		System.out.println("Which element do u want to print: ");
		int n=sc.nextInt();
		int i,count=1;
		for(i=sv;count<n;i=i+i,count++) {
		}
		System.out.println(i);
	}

}
