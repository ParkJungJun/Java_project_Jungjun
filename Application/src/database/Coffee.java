package database;

public class Coffee {
	private Integer coffee_id;
	private String coffee_name;
	private Integer coffee_price;
	
	public Coffee(
		Integer coffee_id,
		String coffee_name,
		Integer coffee_price){
		this.coffee_id = coffee_id;
		this.coffee_name = coffee_name;
		this.coffee_price = coffee_price;
	}
	
	public String toString() {
		return String.format("%d %s %d원",coffee_id, coffee_name,coffee_price);
	}
	
	public Integer getCoffee_id() {
		return coffee_id;
	}
	
	public String getCoffee_name() {
		return coffee_name;
	}
	
	public Integer getCoffee_price() {
		return coffee_price;
	}
}
