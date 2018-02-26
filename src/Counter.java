import java.util.Scanner;

/**
 * 
 * @author Jonathan Meredith
 * This is a program that does a bunch of junk related to a sport called soccer
 * I think
 *
 */


public class Counter {

	public static void main(String[] args) {
		int number1,
			number2;
		
		boolean continueOn = false;
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
			System.out.println(number1 + ",");
			number1 ++;
		} while(number1 <= number2);
	}

}
