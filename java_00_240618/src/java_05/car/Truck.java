package java_05.car;

public class Truck extends Car {

	private double weight; //적재량
	
	public Truck() {
		
	}
	
	public Truck(String arg1, int arg2, int arg3, String arg4, double arg5) {
		super(arg1, arg2, arg3, arg4);
		this.weight = arg5;
	}
	
	public String carInfo() {
		String result = "";

		
		result += "[차종] : " + model + "\n";
		result += "[바퀴 수] : " + wheel + "\n";
		result += "[자리] : " + seat + "\n";
		result += "[연료] : " + fuel + "\n";
		result += "[적재량] : " + weight + "\n";
		
		return result;
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
