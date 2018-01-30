import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	
	  System.out.println("Enter 1, 2, or 3 for ");
	
	  System.out.println("Rock (1), Paper (2), or Scissors (3):");
	  
	  int Rock = 1, Paper = 2, Scissors = 3;
	  
	  int guess = input.nextInt();
	  
	  int randomNumber = (int)(Math.random() + 3);
	  
	    if (randomNumber == Rock) {
	    	
	    	if (guess == Rock) {
	    		
	    		System.out.println("Rock Vs. Rock: Tie.");
	    	
	    	}
	   
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Paper beats Rock: You Win.");
	    	}
	  
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Rock beats Scissors: You Lose.");
	    	}
	    
	    }
	    
	    else if (randomNumber == Paper) {
	    	
	    	if (guess == Rock){
	    		
	    		System.out.println("Paper beats Rock: You Win.");
	    		
	    	}
	    
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Paper Vs. Paper: Tie.");
	    		
	    	}
	    	
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Scissors beat Paper: You Win.");
	    		
	    	}
	    
	    }
	    
	    else if (randomNumber == Scissors) {
	    	
	    	if (guess == Rock) {
	    		
	    		System.out.println("Rock beats Scissors: You Lose.");
	    		
	    	}
	   
	    	else if (guess == Paper) {
	    		
	    		System.out.println("Scissors beat Paper: You Win.");
	    		
	    	}
	    
	    	else if (guess == Scissors) {
	    		
	    		System.out.println("Scissors Vs. Scissors: Tie.");
	    		
	    	}
	    
	    }
	    
	  
	}

}
