package ClearCode;

import java.util.Iterator;
import java.util.Scanner;

public class Write_a_program_to_display_maximum_among_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a=3;
		int b=2;
		int c=1;
	
		int temp=a>b?a:b;
		
		int largestNumber=c>temp?c:temp;
		
		System.out.println(largestNumber);
		
		// In adavance from
		
		int A,B,C;
		Scanner For= new Scanner(System.in);
		
		System.out.println("Enter A");
		A=For.nextInt();
		
		System.out.println("Enter B");
		B=For.nextInt();
		
		System.out.println("Enter C");
		C=For.nextInt();
		
		
		int tempData= A>B?A:B;
		
		int largestDataStore=C>tempData?C:tempData;
		
		System.out.println("By Scanner largest Value"+largestDataStore);
		
		
		
	}

}
