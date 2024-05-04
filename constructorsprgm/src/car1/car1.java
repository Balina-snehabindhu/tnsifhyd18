package car1;

public class car1 {
	private String doors;
	private String engine;
	private String drivers;
	private int speed ;
	
public car1() {
	doors="closed";
	engine="on";
	drivers="seated";
	speed=40;
}
public String run() {
	if(doors.equals("closed") && engine.equals("on")&& drivers.equals("seated") 
			&& speed >0) {
		return "car is running";
	}
	else {
		return "car is not running";
	}
}
}
