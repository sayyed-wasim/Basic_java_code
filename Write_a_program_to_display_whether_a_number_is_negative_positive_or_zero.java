package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_display_whether_a_number_is_negative_positive_or_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner getNumber= new Scanner(System.in);
		System.out.println("Enter Number");
		number= getNumber.nextInt();
		
		if(number>0)
		{
			System.out.println("This number is positive "+number);
		}
		if(number<0)
		{
			System.out.println("This Number is Negative"+number);
		}
		if(number==0)
		{
			System.out.println("This number is Zero"+number);
		}
		
	}

}
