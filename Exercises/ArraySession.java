import java.util.Arrays;

public class ArraySession {

	public static void main(String[] args) {

		int [][] myList = { 
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
	    for(int row = 0; row < myList.length; row++) {
	    	for(int col = 0; col < myList[row].length; col++) {
	    		System.out.print(myList[row][col]);
	    	
	    	}
	    
	    	System.out.println(myList[0][0]);
	    
	    }
	
    }
	
}


