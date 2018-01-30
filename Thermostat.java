public class Thermostat {

	int temperature = 50; //default temperature in °F
	
	boolean on = true; //thermostat is on
	
	public Thermostat() { //creates thermostat
		
	}

    public void turnThermostatOn() { //turns the thermostat on
    	
    	on = true;
    	
    }
	
    public void turnThermostatOff() { //turns the thermostat off
    	
    	on = false;
    	
    }
    
	public void temperatureUp(int newTemperature) { //establishes temperature function
	   
	   if (on && newTemperature >= 50 && newTemperature <= 90)
		   
		   temperature = newTemperature;
	   
    }

    public void temperatureUp() { //increases temperature
    	
    	if(on && temperature < 90)
    		
    		temperature ++;
    	
    }

    public void temperatureDown() { //decreases temperature
    	
    	if(on && temperature > 50)
    		
    		temperature --;
    	
    }
//print statements
//come up with cases such as user input while device is on or off
 }
