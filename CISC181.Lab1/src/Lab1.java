import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

//Russ Stump, Manuel Cuesta

	public class Lab1 {

		public static void main(String[] args) {
			//opening scanner to get user input
			Scanner input = new Scanner(System.in);
			//asks user for the number of years they plan to work 
			System.out.print("How many years do you plan to work?: ");
			double years = input.nextDouble();
			//Asks user for % return while they save for retiring 
			System.out.print("What is your average expected return on your investments?: ");
			double avg_return = input.nextDouble();
			//Asks how long they plan on drawing their saved money
			System.out.print("How long do you plan to draw your savings after retirement?: ");
			double years_draw = input.nextDouble();
			//Asks for return on investments after retirement 
			System.out.print("What is your expected annual return after you retire?: ");
			double return_after = input.nextDouble();
			//Asks how much money they user will need monthly after retiring 
			System.out.print("What is your required monthly income after you retire?: ");
			double SSI = input.nextDouble();
			//declares monthly income minus SSI as a double
			double monthly;
			input.close();
			//makes values monthly
			return_after = return_after / 12;
			years_draw = years_draw * 12;
			//Takes away montly SSI income from users stated required income
			monthly = SSI - 2642;
			double left;
			//You don't want to have any money left over at the end of your life
			left = 0;
			boolean t;
			
			t = false;
			double PV;
			//Calls the present value function
			PV = FinanceLib.pv(return_after, years_draw, monthly, left, t);
			
			
			//Makes user input monthly
			avg_return = avg_return / 12;
			years = years * 12;
			double PMT;
			double P_V;
			P_V = PV;
			//Calls the PMT function
			PMT = FinanceLib.pmt(avg_return, years, left, P_V, t);
			//Makes output of PV a positive number
			PV = PV * -1;
			//Prints results
			System.out.println("Amount you'll need to save each month:");
			System.out.printf("$%,.2f", PV);
			System.out.println("");
			System.out.println("Amount you'll need saved:");
			System.out.printf("$%,.2f", PMT);
			
			
			
			
			
			
		}


}