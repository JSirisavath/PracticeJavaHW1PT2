package Models;

public class Pizza {

	public String toppingOne;
	
	public String toppingTwo;
	
	public String toppingThree;
	
	public Double price;

	public Pizza(String toppingOne, String toppingTwo, String toppingThree, Double price) {
		this.toppingOne = toppingOne;
		this.toppingTwo = toppingTwo;
		this.toppingThree = toppingThree;
		this.price = price;
	}

	public String getToppingOne() {
		return toppingOne;
	}

	public void setToppingOne(String toppingOne) {
		this.toppingOne = toppingOne;
	}

	public String getToppingTwo() {
		return toppingTwo;
	}

	public void setToppingTwo(String toppingTwo) {
		this.toppingTwo = toppingTwo;
	}

	public String getToppingThree() {
		return toppingThree;
	}

	public void setToppingThree(String toppingThree) {
		this.toppingThree = toppingThree;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void displayPizza() {
		System.out.print("Pizza [toppingOne=" + toppingOne + ", toppingTwo=" + toppingTwo + ", toppingThree=" + toppingThree
				+ ", price=" + price + "]");
	}
	
	

}
