package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_develop_a_simple_calculator_application_and_perform_some_basic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double firstInput;
		double secondInput;
		System.out.println("Name of the opration below to use");
		System.out.println("addition ");
		System.out.println("subtraction ");
		System.out.println("multiplication");
		System.out.println("division");
		
		
		String OprationName;
		//first input
		Scanner getFirstValue= new Scanner(System.in);
		System.out.println("Enter first Value");
		firstInput= getFirstValue.nextInt();
		//Second input
		Scanner getSecondValue= new Scanner(System.in);
		System.out.println("Enter Second value");
		secondInput=getSecondValue.nextInt();
		
		//call by name opration
		 Scanner CallOperationName= new Scanner(System.in);
		 System.out.println("Enter opration name");
		 
		 OprationName=CallOperationName.nextLine();
		 
		//Addition 
		 if(OprationName.equalsIgnoreCase("addition"))
		 {
		System.out.println("Addition "+(firstInput+secondInput));
		 }
		 else if(OprationName.equalsIgnoreCase("subtraction"))
		 {
			 System.out.println("subtraction "+(firstInput-secondInput));
		 }
		 else if(OprationName.equalsIgnoreCase("multiplication "))
		 {
			 System.out.println("multiplication "+(firstInput*secondInput));
		 }
		 else if(OprationName.equalsIgnoreCase("division"))
		 {
			 System.out.println("division "+((firstInput/secondInput)));
		 }
		
		//
		
		
		
	}

}
