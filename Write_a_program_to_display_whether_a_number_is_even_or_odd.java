package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_display_whether_a_number_is_even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number;
		Scanner getNumber= new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		Number=getNumber.nextInt();
		
		if(Number %2==0)
		{
			System.out.println("This Number is even "+Number);
		}
		else
		{
			System.out.println("This number is Odd "+Number);
		}
		
	}

}
