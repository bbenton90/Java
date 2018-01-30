public class Alarm {
		
	boolean armed = true; //alarm is armed
	
	boolean on = true; //alarm is on
    
	public void turnOnAlarm() { //turns alarm on
    
    	on = true; 
  
	}
    
	public Alarm() {
		
	}
    
	public void turnOffAlarm() { //turns alarm off
    	
    	on = false;
    	
    	
    
    }
    
    public void alarmArmed() { //arms alarm
    	
    	armed = true;
    	
      
   
    }

    public void alarmDisarmed() { //disarms alarm
    	
    	armed = false;
    	
    	
    	
    }
   //needs print statements
   //come up with instances when user inputs numbers but object is off or on
}