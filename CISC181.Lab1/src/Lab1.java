// Import the Scanner utility in order to ask the user for input 
import java.util.Scanner;
// Call the Apache Finance Class to run Calculations


//Manuel Cuesta and Russ Stump, CISC 181 Lec 011

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many years do you plan to work?: ");
		int years = input.nextInt();
		
		System.out.print("What is your average expected return on");
		System.out.println(" your investments?: ");
		float avg_return = input.nextFloat();
		
		System.out.print("How long do you plan to draw your ");
		System.out.println(" savings after retirement? ");
		int years_draw = input.nextInt();
		
		System.out.print("What would your expected annual return ");
		System.out.println(" after you retire?: ");
		float return_after_retire = input.nextFloat();
		
		System.out.print("What would your required monthly income ");
		System.out.println(" after you retire? ");
		float req_income = input.nextFloat();
		
		System.out.print("What would be your monthly SSI?: ");
		float ssi = input.nextFloat();
		
		//Just to make sure the variables are being assigned
		//and they all worked
		
		System.out.print("\n");
		System.out.print(years);
		System.out.print("\n");
		System.out.print(avg_return);
		System.out.print("\n");
		System.out.print(years_draw);
		System.out.print("\n");
		System.out.print(return_after_retire);
		System.out.print("\n");
		System.out.print(req_income);
		System.out.print("\n");
		System.out.print(ssi);
		
	}

}