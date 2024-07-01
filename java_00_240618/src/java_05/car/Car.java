package java_05.car;

public class Car {

	//매개변수(필드)
	protected String model; //차종
	protected int wheel; 	//바퀴 수
	protected int seat;
	protected String fuel;

	public Car() {

	}

	public Car(String arg1, int arg2, int arg3, String arg4) {
		this.model = arg1;
		this.wheel = arg2;
		this.seat = arg3;
		this.fuel = arg4;

	}

	public String carInfo() {
		String result = "";

		result += "[차종] : " + model + "\n";
		result += "[바퀴 수] : " + wheel + "\n";
		result += "[자리] : " + seat + "\n";
		result += "[연료] : " + fuel + "\n";

		return result;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
