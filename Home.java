import java.util.Scanner;

public class Home {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		
		Alarm alarm = new Alarm();
	     
		Microwave microwave = new Microwave();
		
		Thermostat thermostat = new Thermostat();
		
		Shower shower = new Shower();
		
		Command Jo = new Command();
		
		System.out.println("Hi, I'm Jo.");
		
	while(loop) {
		
		 System.out.println("I can help with the following:");
		 
		 System.out.println("1: Alarm");
		 
		 System.out.println("2: Thermostat");
		 
		 System.out.println("3: Microwave");
		 
		 System.out.println("4: Shower");
		 
		 System.out.println("5: Exit");
		 
		  String command = input.next();
		  
		  System.out.println(command);
		
	 if(command.equals("1")){
		 
		 System.out.println("1: Turn on Alarm");
		 
		 System.out.println("2: Turn off Alarm");
		 
		 System.out.println("3: Arm the Alarm");
		 
		 System.out.println("4: Disarm the Alarm");
		 
		 command = input.next();
		 
	 
	 
		 if(command.equals("1")) {
			
			 Jo.turnOnAlarm(alarm);
			 
		 }
		 
		 else if(command.equals("2")) {
			 
			 Jo.turnOffAlarm(alarm);
			 
		 }
		 
		 else if(command.equals("3")) {
			 
			 Jo.alarmArmed(alarm);
			 
		 }
		 
		 else if(command.equals("4")) {
			 
			 Jo.alarmDisarmed(alarm);
			 
		 }
	}
		 
	else if(command.equals("2")) {
		
		System.out.println("1: Turn thermostat on");
		 
		System.out.println("2: Turn thermostat off");
		 
		System.out.println("3: Turn temperature up");
		 
		System.out.println("4: Turn temperature down");
		
		command = input.next();
	
	
	    if(command.equals("1")) {
	    	
	    	Jo.turnThermostatOn(thermostat);
		
	    }
	 
	    else if(command.equals("2")) {
	    	
	    	Jo.turnThermostatOff(thermostat);
	  
	    }
	 
	    else if(command.equals("3")) {
	    	
	    	System.out.println("Enter the change in temperature: ");
	    	
	    	String temp = input.next();
	    	
	    	int x = Integer.parseInt(temp);
	    	
	    	Jo.thermostatTemperatureUp(thermostat, x);
	    }
		  
	    else if(command.equals("4")) {
	    	
            System.out.println("Enter the change in temperature: ");
	    	
	    	String temp = input.next();
	    	
	    	int x = Integer.parseInt(temp);
	    	
	    	Jo.thermostatTemperatureDown(thermostat, x);
	    	
	    }
	 
	}
  else if(command.equals("3")) {
	    	
	  System.out.println("1: Turn Microwave on");
		 
	  System.out.println("2: Turn Microwave off");
		 
      System.out.println("3: Set cooktime");
		 
      System.out.println("4: Cook popcorn");
      
      System.out.println("5: Defrost food");
		 
	  System.out.println("6: Cook potato");
		 
	  System.out.println("7: Reheat food");
      
      command = input.next();
      
  
	
    if(command.equals("1")) {
    	
    	Jo.turnMicrowaveOn(microwave);
    	
    }
	 
    else if(command.equals("2")) {
    	
    	Jo.turnMicrowaveOff(microwave);
    }
	 
    else if(command.equals("3")) {
    	
    	 System.out.println("Enter the desired cooktime: ");
	    	
	    	String cookTime = input.next();
	    	
	    	int x = Integer.parseInt(cookTime);
	    	
	    	Jo.cookTime(microwave, x);
    }
	 
	else if(command.equals("4")) {
		
		    Jo.cookPopcorn(microwave);
	    
	}
	 
	else if(command.equals("5")) {
		
		Jo.defrostFood(microwave);
	    	
    }
	 
	else if(command.equals("6")) {
		
		Jo.cookPotato(microwave);
	}
	 
	else if(command.equals("7")) {
		
		Jo.reheatFood(microwave);
	}	
  
  }
	 
	else if(command.equals("4")) {
	  
		System.out.println("1: Turn Shower on");
		 
		System.out.println("2: Turn Shower off");
			 
	    System.out.println("3: Increase shower temperature");
			 
	    System.out.println("4: Decrease shower temperature");
	    
	    command = input.next();
	    
	 
    if(command.equals("1")) {
		
		Jo.turnShowerOn(shower);
		
	}
	 
	else if(command.equals("2")) {
		
		Jo.turnShowerOff(shower);
		
	}
	 
	else if(command.equals("3")) {
		
		Jo.tempUp(shower);
		
	}
	 
	else if(command.equals("4")) {
		
		Jo.tempDown(shower);
		
	}
	 
}
	 
  else if(command.equals("5")) {
	    	
	    	System.out.println("Goodbye.");
	    	
	    	loop = false;
	    	
	    }
	    	
	   }	

    }		

}
