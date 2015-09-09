import java.util.Scanner;

//Manuel Cuesta and Russ Stump, CISC181 Lec 011

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many years do you plan to work?: ");
		int years = input.nextInt();
		
		System.out.print("What is your average expected return on");
		System.out.println(" your investments?: ");
		float avg_return = input.nextFloat();
		
		System.out.print("How long do you plan to draw your ");
		System.out.println(" savings after retirements? ");
		int years_draw = input.nextInt();
		
		System.out.print("What is your expected annual return ");
		System.out.println(" after you retire?: ");
		float return_after_retire = input.nextFloat();
		
		System.out.print("What is your required monthly income ");
		System.out.println(" after you retire? ");
		float ssi = input.nextFloat();
		
		//Just to make sure the variables are being assigned
		//and they all worked
		/*
		System.out.print(years);
		System.out.print(avg_return);
		System.out.print(years_draw);
		System.out.print(return_after_retire);
		System.out.print(ssi);
		*/
	}

}