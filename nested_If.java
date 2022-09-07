package class_assignments;

import java.util.Scanner;

public class nested_If {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person to check eligibity to work: ");
		int age=sc.nextInt();
		check(age);
	}
	public static void check(int a) {
		Scanner sc=new Scanner(System.in);
		if(a>=0) {
			if(a<18) {
				System.out.println("Child labour is not allowed: Not eligible to work");
			}
			if(a>=18) {
				if(a>=60) {
					System.out.println("Retired Person: Not eligible to work");
				}
				else {
					System.out.println("Enter the education: ");
					String education=sc.next();
					if(education!=null) {
						System.out.println("Eligible to work with the degree "+education);
					}
				}
			}
		}
		else if(a<0){
			System.out.println("Please enter the correct age");
		}
	}
}
