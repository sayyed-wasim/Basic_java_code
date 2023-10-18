package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_convert_days_into_years_weeks_and_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Months;
		int Year;
		int weeks;
		int day;
		
		Scanner InConsole= new Scanner(System.in);
		
		System.out.println("Please enter the days");
		
		Months= InConsole.nextInt();
		
		// for the Year
		
		Year= Months/365;
		Months=Months%365;
		
		System.out.println("Year"+Year);
		
		weeks= Months/7;
		Months=Months%7;
	
		System.out.println("weeks"+weeks);
		
		day=Months;
		
		System.out.println("Days"+day);
		
		
		
		
		
		
		

	}

}
