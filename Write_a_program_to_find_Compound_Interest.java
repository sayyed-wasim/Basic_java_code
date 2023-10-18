package ClearCode;

public class Write_a_program_to_find_Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Principle;
		double rate;
		double time;
		
		double CompoundInterest;
		
		Principle=1200; rate=12; time=2;
		
		CompoundInterest=Principle*(Math.pow(1+rate/100, time));
		
		System.out.println("Compound of Interst"+CompoundInterest);
		

	}

}
