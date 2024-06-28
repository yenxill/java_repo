package java_05.car;

public class Lightcar extends Car{

	private double discountOffer; //경차 할인율
	
	public Lightcar() {
		
	}
	
	public String carInfo() {
		String result = "";
		
		result += "[차종] : " + model + "\n";
		result += "[바퀴 수] : " + wheel + "\n";
		result += "[자리] : " + seat + "\n";
		result += "[연료] : " + fuel + "\n";
		result += "[할인혜택] : " + discountOffer + "\n";
		
		
		return result;
		
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
	
	
}
