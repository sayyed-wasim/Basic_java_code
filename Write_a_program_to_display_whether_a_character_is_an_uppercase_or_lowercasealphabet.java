package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_display_whether_a_character_is_an_uppercase_or_lowercasealphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		Scanner Check= new Scanner(System.in);
		
		System.out.println("Enter Char");
		input=Check.nextLine();
		
		if(input==input.toLowerCase())
		{
			System.out.println("lower case "+input);
		}
		else
		{
			System.out.println("Upper case"+input);
		}

	}

}
