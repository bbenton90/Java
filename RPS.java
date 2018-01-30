import java.util.Scanner;

// imports Scanner ability

public class RPS { // RPS = Rock Paper Scissors

	public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	
	  System.out.println("Enter 1, 2, or 3 for\nRock (1)\nPaper (2)\nScissors (3):");
	  
	  // user will choose rock, paper, or scissors to play
	  
	  int Rock = 1, Paper = 2, Scissors = 3;
	  
	    // 1 = Rock
	  
	    // 2 = Paper
	  
	    // 3 = Scissors
	  
	  int guess = input.nextInt();
	  
	    // establish user input
	  
	  int randomNumber = (int)(Math.random() * 3) + 1;
	  
	  // computer chooses a random number between one and three
	  
	    if (randomNumber == Rock) {
	    	
	    	if (guess == Rock) {
	    		
	    		System.out.println("Rock Vs. Rock: Tie.");
	    		
	    		// if user guess matches rock, it is a tie
	    	
	    	    System.out.println("Thank you for playing!");
	    	
	    	}
	   
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Paper beats Rock: You Win.");
	    		
	    		// if user guesses paper, you win
	    	
	    	    System.out.println("Thank you for playing!");
	    	
	    	}
	  
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Rock beats Scissors: You Lose.");
	    		
	    		// if user guesses scissors, you lose
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	    
	    }
	    
	    else if (randomNumber == Paper) {
	    	
	    	if (guess == Rock){
	    		
	    		System.out.println("Paper beats Rock: You Lose.");
	    		
	    		// if user guesses rock, you lose
	    		
	    	    System.out.println("Thank you for playing!");
	    	
	    	}
	    
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Paper Vs. Paper: Tie.");
	    		
	    		// if user guess matches paper, it is a tie
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	    	
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Scissors beat Paper: You Win.");
	    		
	    		// if user guesses scissors, you win
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	    
	    }
	    
	    else if (randomNumber == Scissors) {
	    	
	    	if (guess == Rock) {
	    		
	    		System.out.println("Rock beats Scissors: You Win.");
	    		
	    		// if user guesses rock, you win
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	   
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Scissors beat Paper: You Lose.");
	    		
	    		// if user guesses paper, you lose
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	    
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Scissors Vs. Scissors: Tie.");
	    		
	    		// if user guess matches scissors, it is a tie
	    		
	    		System.out.println("Thank you for playing!");
	    	
	    	}
	    
	    	else {
	    		
	    		System.out.println("Incorrect Input.");
	    		
	    		// If a number other than 1, 2, or 3 is entered, "Incorrect Input" will appear
	    		
	    		System.out.println("Please enter a 1, 2, or 3.");
	    	
	    	}
	    
	    }
	   
	}
	
}
