package myobj;

public class Car {
	public String color;
	public int size;
	public int speed;
	
	public void blue(){
		color = "blue";
	}
	public void green() {
		color = "green";
	}
	public void bigger() {
		++size;
	}
	public void faster() {
		speed += 10;
	}
	public void smaller() {
		--size;
	}
	public void slower() {
		speed -= 10;
	}
	public void orange() {
		color = "orange";
	}
	
	public Car() {
		this("black",10,100);
	}
	
	public Car(String color) {
		this(color,10,100);
	}
	
	public Car(String color, int size, int speed) {
		this.color = color;
		this.size = size;
		this.speed= speed;
	}
	
	public void info() {
		System.out.printf("색 : %s\n크기: %d\n속도: %d\n",
				color,size,speed);
	}
}
