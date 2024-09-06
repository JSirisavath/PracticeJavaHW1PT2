package Models;

public class Television {

	public Double tvSize;
	
	public Double price;

	public Television(Double tvSize, Double price) {
		this.tvSize = tvSize;
		this.price = price;
	}

	public Double getTvSize() {
		return tvSize;
	}

	public void setTvSize(Double tvSize) {
		this.tvSize = tvSize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void displayTVInfo() {
		System.out.print("Television [tvSize=" + tvSize + ", price=" + price + "]");
	}
	
	
	

}
