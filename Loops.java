public class Loops {

	public static void main(String[] args) {
		
        int x = 5;
		
		while (x <= 100) {
			
			System.out.print(x +" ");
			
		    x += 5;
		
		}
		
		System.out.println();
	
	    for (x = 5; x <= 100; x += 5) {
			   
			   System.out.print(x + " ");
			   
	 }
		   
	   System.out.println();
		   
       int x1 = 5;
		   
		   do {
        	
        	System.out.print(x1 + " ");
        	
        	x1 += 5;
        	
        } while (x1 <= 100);
	    
	}

}
