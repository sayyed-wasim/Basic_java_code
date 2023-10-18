package ClearCode;

import java.util.Scanner;

public class Write_a_program_to_input_an_alphabet_and_display_whether_it_is_a_vowel_or_a_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String VolweChar;
		
		
		Scanner getChar= new Scanner(System.in);
		
		System.out.println("Enter Char");
		
		VolweChar=getChar.nextLine();
		
		String Upper= VolweChar.toUpperCase();
		System.out.println(Upper);
		
		if(Upper.equals("A")|| Upper.equals("E") || Upper.equals("I")|| Upper.equals("O")|| Upper.equals("U"))
		{
			System.out.println("This the vowel char "+VolweChar );
		}
		else
		{
			System.out.println("This is consonant");
		}

	}

}
