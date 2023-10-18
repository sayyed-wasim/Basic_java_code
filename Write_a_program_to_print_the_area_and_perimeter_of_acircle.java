package ClearCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Write_a_program_to_print_the_area_and_perimeter_of_acircle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		double radius;
		
		double circle;
		double perimeter;
		
		double area;
		
		BufferedReader bufferRead= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter radius");
		
		String ReadMe=bufferRead.readLine();
		
		radius=Integer.parseInt(ReadMe);
		
		area=3.14*radius*radius;
		
		perimeter=2*3.14*radius;
		
		System.out.println("Area of the Circle"+area);
		System.out.println("Perimeter of the redius"+perimeter);
		
		
		
		

	}

}
