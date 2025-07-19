
public interface RemoteControl {
		
	void turnOn();
	void turnOff();
}

class Tv implements RemoteControl{
	
	public void turnOn() {
		System.out.println("Tv On");
	}
	
	public void turnOff() {
		System.out.println("Tv Off");
	}
}