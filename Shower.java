//This program controls the shower.
public class Shower {
	
boolean on = true;

int temp = 80;

public Shower() {
	
}

//Some numbers are preset for certain actions.
int hot = 1;//1 is set for 107 degrees F.
int warm = 2;//2 is set for 98 degrees F.
int cold = 3;//3 is set for 80 degrees F.
//Set the buttons to turn on and off.

public void turnOnShower() {

	on = true;

}

public void turnOffShower() {

	on = false;

}

public void tempUp() {
	
	if(on && temp < 107)
		
		temp ++;
	
}

public void tempDown() {
	
	if(on && temp > 80)
		
		temp --;
	
}

  
}

