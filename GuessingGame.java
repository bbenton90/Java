import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number between 1 and 10: ");
		
		int randomNumber = (int)(Math.random() * 10) + 1;

		int guess = input.nextInt();
		
		  if (guess == randomNumber) {
			
			System.out.println("Good job");
			
		  }
		
		  else {
			
			System.out.println("Sorry, the number was " + randomNumber + ".");
		
		  }
   
	}

}