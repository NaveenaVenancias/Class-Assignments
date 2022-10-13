package class_assignments;

import java.util.Scanner;

public class NoOfDaysBtTwoDates {

	public static void main(String[] args) {
		numberOfDays();
	}

	private static void numberOfDays() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start date: ");
		int startDate=sc.nextInt();
		System.out.println("Enter the start month: ");
		int startMonth=sc.nextInt();
		System.out.println("Enter the start year: ");
		int startYear=sc.nextInt();
		System.out.println("Enter the end date: ");
		int endDate=sc.nextInt();
		System.out.println("Enter the end month: ");
		int endMonth=sc.nextInt();
		System.out.println("Enter the end year: ");
		int endYear=sc.nextInt();
		
		int daysArray[]= {31,0,31,30,31,30,31,31,30,31,30,31};
		int noOfDays=0;
		for(int indexYear=startYear;indexYear<=endYear;indexYear++) {
			
			if((((indexYear%4)==0)&&(indexYear%100)!=0)||((indexYear%400)==0)) {
				daysArray[1]=29;
			}
			else {
				daysArray[1]=28;
			}
			if(startYear==endYear) {
				for(int indexMonth=startMonth-1;indexMonth<endMonth;indexMonth++) {
					if(startMonth-1==endMonth-1) {
						noOfDays=noOfDays+endDate-startDate;
					}
					else if(indexMonth==startMonth-1) {
						noOfDays=noOfDays+daysArray[indexMonth]-startDate;
					}
					else if(indexMonth==endMonth-1) {
						noOfDays=noOfDays+endDate;
					}
					else if((indexMonth!=startMonth-1)&&(indexMonth!=endMonth-1)) {
						noOfDays=noOfDays+daysArray[indexMonth];
					}
				}
			}
			else if((startYear!=endYear)&&(indexYear==startYear)) {
				for(int indexMonth=startMonth-1;indexMonth<12;indexMonth++) {
					if(indexMonth==startMonth-1) {
						noOfDays=noOfDays+daysArray[indexMonth]-startDate;
					}
					else {
						noOfDays=noOfDays+daysArray[indexMonth];
					}
				}
			}
			else if((startYear!=endYear)&&(indexYear==endYear)) {
				for(int indexMonth=0;indexMonth<endMonth;indexMonth++) {
					if(indexMonth==endMonth-1) {
						noOfDays=noOfDays+endDate;
					}
					else {
						noOfDays=noOfDays+daysArray[indexMonth];
					}
				}
			}
			else if((startYear!=endYear)&&(indexYear!=startYear)&&(indexYear!=endYear)) {
				for(int indexMonth=0;indexMonth<12;indexMonth++) {
					noOfDays=noOfDays+daysArray[indexMonth];
				}
			}
		}
		System.out.println("No of days: "+noOfDays);
	}

}
