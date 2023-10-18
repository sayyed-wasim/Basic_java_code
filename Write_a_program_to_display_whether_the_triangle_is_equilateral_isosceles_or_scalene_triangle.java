package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_display_whether_the_triangle_is_equilateral_isosceles_or_scalene_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		int y;
		int z;
		
		// X value
		Scanner getX= new Scanner(System.in);
		System.out.println("Enter X value");
		x=getX.nextInt();
		
		//Y Value
		Scanner getY= new Scanner(System.in);
		System.out.println("Enter Y value");
		y=getY.nextInt();
		
		//Z value
		Scanner getZ= new Scanner(System.in);
		System.out.println("Enter Z value");
		z=getZ.nextInt();
		
		
		
		if(x==y && y==z)
		{
			System.out.println("equilateral triangle");
		}
		else if(x==y || y==z || z==x)
		{
			System.out.println("isosceles triangle ");
		}
		else
		{
			System.out.println("scalene triangle");
			
		}
		
		

	}

}
