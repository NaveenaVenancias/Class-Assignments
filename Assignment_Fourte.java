package class_assignments;

import java.util.Scanner;

public class Assignment_Fourte {

	public static void main(String[] args) {
		solutionForFourte();
	}

	private static void solutionForFourte() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Output number: ");
		byte result=sc.nextByte();
		System.out.println("Enter four numbers: ");
		int numbers[]=new int[4];
		for(byte index=0;index<4;index++) {
			numbers[index]=sc.nextByte();
		}
		additionCheck(result,numbers);
		subtractionCheck(result,numbers);
		multiplicationCheck(result,numbers);
		divisionCheck(result,numbers);
	}

	private static void additionCheck(byte result, int[] numbers) {
		if(numbers[0]+numbers[1]+numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"+"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]-numbers[1]+numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"+"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+numbers[1]-numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"-"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+numbers[1]+numbers[2]-numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"+"+numbers[2]+"-"+numbers[3]);
		}
	}
	
	private static void subtractionCheck(byte result, int[] numbers) {
		if(numbers[0]-numbers[1]-numbers[2]-numbers[3]==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"-"+numbers[2]+"-"+numbers[3]);
		}
		else if(numbers[0]+numbers[1]-numbers[2]-numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"-"+numbers[2]+"-"+numbers[3]);
		}
		else if(numbers[0]-numbers[1]+numbers[2]-numbers[3]==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"+"+numbers[2]+"-"+numbers[3]);
		}
		else if(numbers[0]-numbers[1]-numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"-"+numbers[2]+"+"+numbers[3]);
		}
		else if((numbers[0]*numbers[1])-numbers[2]-numbers[3]==result) {
			System.out.println("("+numbers[0]+"*"+numbers[1]+")"+"-"+numbers[2]+"-"+numbers[3]);
		}
		else if(numbers[0]-(numbers[1]*numbers[2])-numbers[3]==result) {
			System.out.println(numbers[0]+"-("+numbers[1]+"*"+numbers[2]+")-"+numbers[3]);
		}
		else if(numbers[0]-numbers[1]-(numbers[2]*numbers[3])==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"-("+numbers[2]+"*"+numbers[3]+")");
		}
		else if((numbers[0]/numbers[1])-numbers[2]-numbers[3]==result) {
			System.out.println("("+numbers[0]+"/"+numbers[1]+")-"+numbers[2]+"-"+numbers[3]);
		}
		else if(numbers[0]-(numbers[1]/numbers[2])-numbers[3]==result) {
			System.out.println(numbers[0]+"-("+numbers[1]+"/"+numbers[2]+")-"+numbers[3]);
		}
		else if(numbers[0]-numbers[1]-(numbers[2]/numbers[3])==result) {
			System.out.println(numbers[0]+"-"+numbers[1]+"-("+numbers[2]+"/"+numbers[3]+")");
		}
	}
	
	private static void multiplicationCheck(byte result, int[] numbers) {
		if((numbers[0]*numbers[1]*numbers[2]*numbers[3])==result) {
			System.out.println(numbers[0]+"*"+numbers[1]+"*"+numbers[2]+"*"+numbers[3]);
		}
		else if((numbers[0]*numbers[1])+numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"*"+numbers[1]+"+"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+(numbers[1]*numbers[2])+numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"*"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+numbers[1]+(numbers[2]*numbers[3])==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"+"+numbers[2]+"*"+numbers[3]);
		}
		else if((numbers[0]/numbers[1])*numbers[2]*numbers[3]==result) {
			System.out.println(numbers[0]+"*"+numbers[1]+"+"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]*(numbers[1]/numbers[2])*numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"*"+numbers[2]+"+"+numbers[3]);
		}
		else if((numbers[0]*numbers[1])*(numbers[2]/numbers[3])==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"+"+numbers[2]+"*"+numbers[3]);
		}
	}
	
	private static void divisionCheck(byte result, int[] numbers) {
		if((numbers[0]/numbers[1])/(numbers[2]/numbers[3])==result) {
			System.out.println(numbers[0]+"/"+numbers[1]+"/"+numbers[2]+"/"+numbers[3]);
		}
		else if((numbers[0]/numbers[1])+numbers[2]+numbers[3]==result) {
			System.out.println(numbers[0]+"/"+numbers[1]+"+"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+(numbers[1]/numbers[2])+numbers[3]==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"/"+numbers[2]+"+"+numbers[3]);
		}
		else if(numbers[0]+numbers[1]+(numbers[2]/numbers[3])==result) {
			System.out.println(numbers[0]+"+"+numbers[1]+"+"+numbers[2]+"/"+numbers[3]);
		}
	}
}
