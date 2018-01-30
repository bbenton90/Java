public class Command {

	public boolean turnOnAlarm(Alarm myAlarm) { //Alarm turns on
		
		System.out.println("Alarm is now on.");
	    
	    myAlarm.turnOnAlarm();
			
		return true;
		
		}
	
	public boolean turnOffAlarm(Alarm myAlarm) { //Alarm turns off
		
		System.out.println("Alarm is now off.");
		
		myAlarm.turnOffAlarm();
		
		return false;
	
	}

    public boolean alarmArmed(Alarm myAlarm) { //Alarm is armed
    	
    	System.out.println("Alarm is now armed.");
    	
    	myAlarm.alarmArmed();
    	
    	return true;
    	
    }

    public boolean alarmDisarmed(Alarm myAlarm) { //Alarm is disarmed
    	
    	System.out.println("Alarm is now disarmed.");
    	
    	myAlarm.alarmDisarmed();
    	
    	return false;
    	
    }

    public boolean turnThermostatOn(Thermostat myThermostat) { //Thermostat turns on
    	
    	System.out.println("The thermostat is now on.");
    	
    	myThermostat.turnThermostatOn();
    	
    	return true;
    	
    }

    public boolean turnThermostatOff(Thermostat myThermostat) { //Thermostat turns off
    	
    	System.out.println("The thermostat is now off.");
    	
    	myThermostat.turnThermostatOff();
    	
    	return false;
    	
    }
    
    public void thermostatTemperatureUp(Thermostat myThermostat, int x) { //Thermostat temperature increases
    	
    	Integer.parseInt("x", 10);
    	
    	System.out.println("Temperature increased.");
    	
    	myThermostat.temperatureUp(x);
    	
    }

    public void thermostatTemperatureDown(Thermostat myThermostat, int x) { //Thermostat temperature decreases
    	
    	Integer.parseInt("x", 10);
    	
    	System.out.println("Temperature decreased.");
    	
    	myThermostat.temperatureDown();
    	
    }

    public void turnMicrowaveOn(Microwave myMicrowave) { //Microwave turns on
    	
    	System.out.println("Hello. Enter a cook time or choose a preset option.");
    	
    	myMicrowave.turnOnMicrowave();
    	
    	boolean on = true;
    	
    }
    
    public void turnMicrowaveOff(Microwave myMicrowave) { //Microwave turns off
    	
    	System.out.println("Goodbye.");
    	
    	myMicrowave.turnOffMicrowave();
    	
    	boolean on = false;
    	
    }
    
    public void cookTime(Microwave myMicrowave, int x) { //Set a specific cook time
    	
    	Integer.parseInt("x", 10);
    	
    	System.out.println("Now cooking.");
    	
    	myMicrowave.cookTime(x);
    	
    }
    
    public void cookPopcorn(Microwave myMicrowave) { //Cooks popcorn for default time amount
    	
    	System.out.println("Popping popcorn.");
    	
    	myMicrowave.popcorn();
    	
    }
    
    public void defrostFood(Microwave myMicrowave) { //Defrosts food
    	
    	System.out.println("Defrosting food.");
    	
    	myMicrowave.defrost();
    	
    }

    public void cookPotato(Microwave myMicrowave) { //Cooks potato for default time amount
    	
    	System.out.println("Cooking potato.");
    	
    	myMicrowave.potato();
    	
    }
    
    public void reheatFood(Microwave myMicrowave) { //Reheats food
    	
    	System.out.println("Reheating food.");
    	
    	myMicrowave.reheat();
    	
    }
    
    public void turnShowerOn(Shower myShower) { //Turns shower on
    	
    	System.out.println("Hello. Enter a temperature or choose a preset option.");
    	
    	boolean on = true;
    	
    	myShower.turnOnShower();
 
    }
    
    public void turnShowerOff(Shower myShower) { //Turns shower off
    	
    	System.out.println("Goodbye.");
    	
    	boolean on = false;
    	
    	myShower.turnOffShower();
    	
    }
    
    public void tempUp(Shower myShower) { 
    	
    	Integer.parseInt("107", 10);
    	
    	System.out.println("Heating Water.");
    	
    	myShower.tempUp();
    	
    }
    
    public void tempDown(Shower myShower) { 
    
    	Integer.parseInt("98", 10);
    	
    	System.out.println("Heating Water.");
    	
    	myShower.tempDown();
    	
    }
    
}
