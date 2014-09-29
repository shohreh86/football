
// Fatemeh Sedigh Haghighat

package defaultPackage;

import java.util.Scanner;


public class quarterBack {

	private static Scanner user_input;

	public static void main(String[] args) {
		
		
		double ATT;
		double COMP;
		double YDS;
		int TD;
		int INT;
		
		user_input = new Scanner(System.in);
		
		
		
		System.out.print("Enter the passing YARDS: ");
		YDS = user_input.nextDouble();
		
		System.out.print("Enter amount of TOUCHDOWN passes: ");
		TD = user_input.nextInt();
		
		System.out.print("Enter amound of INTERCEPTIONS: ");
		INT = user_input.nextInt();
		
		System.out.print("Enter number of Passing ATTEMPTS: ");
		ATT = user_input.nextInt();
		
		System.out.print("Enter number of COMPLETIONS: ");
		COMP = user_input.nextInt();

		
		float a;
		a = (float) ((((COMP/ATT) * 100) - 30) * 0.05);
		System.out.println(a);
		
		float b;
		b = (float) (((YDS/ATT) - 3) * .25);
		System.out.println(b);
		
		float c;
		c = (float) (((TD/ATT) * 100) * 0.2);
		System.out.println(c);
		
		float d;
		d = (float) (2.375 - (((INT/ATT) * 100) * 0.25));
		System.out.println(d);
		
		double finalRate;
		
		finalRate = ((a + b + c + d) / 6) * 100;
		System.out.println(a+b+c+d);
		System.out.println((a + b + c + d) / 6);
		
		System.out.println("The passer rating for the player stats is: " + finalRate);
		
		
		double exception;
		
		if (finalRate > 66.7 )	{
			
			exception = finalRate;
			
			System.out.println("The rating " + exception + " indicates that of an average performance.");
			
			if (finalRate < 100)	{
			
			System.out.println("The rating " + finalRate + " indicates the player has an excellent performance.");
		
			}
		
		}

	}

}
