package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_display_maximum_number_and_minimum_number_between_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne;
		int numberTwo;
		
		Scanner getFirstNumber= new Scanner(System.in);
		
		System.out.println("Enter first Number");
		numberOne=getFirstNumber.nextInt();
		
		Scanner getSecondNumber= new Scanner(System.in);
		
		System.out.println("Enter Two Number");
		
		numberTwo=getSecondNumber.nextInt();
		
		if(numberOne>numberTwo)
		{
			System.out.println("First Number is greter "+numberOne);
		}
		if(numberOne<numberTwo)
		{
			System.out.println("2nd number is grether "+numberTwo);
		}
		if(numberOne==numberTwo)
		{
			System.out.println("Both are equal");
		}
		
		
		

	}

}
