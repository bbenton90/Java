//This program controls the microwave.
public class Microwave {

boolean on = true;

public Microwave() {
	
}
	
//Some numbers are preset for certain actions.
int defrost = 300;// is set for 300 seconds defrost
int reheat = 180;// is set for 180 seconds reheat.
int popcorn = 120;// is set for 120 seconds cook time for popcorn.
int potato = 240;// is set for 240 seconds cook time for a baked potato.
int cookTime = 0;

public void turnOnMicrowave() {
  
	on = true;

}

public void turnOffMicrowave(){

	on = false;

}

public void cookTime(int Time) {
	
	cookTime = Time;

}

public void defrost(){
	
	cookTime = defrost;
	
}

public void reheat(){
	
	cookTime = reheat;

}

public void popcorn(){

	cookTime = popcorn;

}

public void potato(){

	cookTime = potato;

}

}