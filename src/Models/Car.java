package Models;

public class Car {

	public String carName;
	public String color;
	public Double miles;
	

	public Car(String carName, String color, Double miles) {
		this.carName = carName;
		this.color = color;
		this.miles = miles;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getMiles() {
		return miles;
	}
	public void setMiles(Double miles) {
		this.miles = miles;
	}

	// Display info function
public void displayCarDetails() {
	System.out.print("Car Name: " + carName + "\n");
	System.out.print("Car Color: " + color  + "\n");
	System.out.print("Miles: " + miles  + "\n");
}
	
}
