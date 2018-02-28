import java.util.Scanner;

/**
 * 
 * @author Jonathan Meredith
 * This is a program that asks the user for two different numbers. The
 * second number must be at least 20 more than the first number.  Then
 * this program outputs all of the different numbers between the first
 * number to the second number. If the number is divisable by 3, 5, or 7
 * then it outputs a prefix to it.
 *
 */


public class Counter {

	public static void main(String[] args) {
		//Declare integers
		int number1,
			number2;
		
		//Declare Boolean
		boolean continueOn = false;
		boolean displayNumber;
		
		//Prep Scanner
		Scanner scan = new Scanner(System.in);

		//Get and check first number from the user
		do {
			System.out.println("Please enter in the first number");
			number1 = scan.nextInt();
			if (number1 > 0) {
				continueOn = true;
			} else if(number1 <= 0){
				System.out.println("Try again. The number must be greater "
						+ "than 0.");
			}
			
		} while (continueOn == false);
	
		//Reset continueOn
		continueOn = false;
		
		//Get and check the second number from the user
		do {
			System.out.println("Please enter in the second number");
			number2 = scan.nextInt();
			if (number2 >= (number1 + 20)) {
				continueOn = true;
			} else if(number2 < (number1 + 20)){
				System.out.println("Try again. The number must be at least"
						+ " 20 greater than " + number1 + ".");
			}
		} while (continueOn == false);
		
		//Close scanner
		scan.close();
		
		//Start Output
		do {
			
			//Reset displayNumber
			displayNumber = true;
			
			//Divisible by 3?
			if ((number1 % 3) == 0){
				System.out.print("Tri");
				displayNumber = false;
			}
			
			//Divisible by 5?
			if ((number1 % 5) == 0){
				System.out.print("Pente");
				displayNumber = false;
			}
			
			//Divisible by 7?
			if ((number1 % 7) == 0){
				System.out.print("Septi");
				displayNumber = false;
			}
			
			//Display if not
			if (displayNumber == true) {
				System.out.print(number1);
			}
			
			//Goto next number and make sure I add a new line.
			number1 ++;
			System.out.println("");
			
		} while(number1 <= number2);
	}

}
