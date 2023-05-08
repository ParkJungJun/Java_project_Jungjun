package myobj;

public class Potterwheel {
	
	String product;
	int probability;
	double Quantity;
	
	public Potterwheel (String product,int probability,double Quantity) {
		this.probability = probability;
		this.product = product;
		this.Quantity = Quantity;
	}
	
	public String toString() {
		return product + "에 당첨되셨습니다 남은 수량: " + probability;
}
	public void MinusProbability() {
		--probability;
	}
	
	public void zeroProbability() {
		if(probability == 0) {
//			MinusProbability();
			System.out.println(toString());
		}
			
	}

}