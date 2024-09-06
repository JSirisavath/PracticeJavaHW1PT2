package Models;

public class Shoe {
	
	// fields
	public String shoeName;
	public Double shoeSize;
	public Boolean isNameBrandShoe;
	
	
	// Constructor 
public Shoe(String shoeName, Double shoeSize, Boolean isNameBrandShoe)	{
	// When an instance is created with this object, initialize those fields
	this.shoeName = shoeName;
	this.shoeSize = shoeSize;
	this.isNameBrandShoe = isNameBrandShoe;
}

	// Get shoeName
public String getShoesName() {
	return shoeName;
}

	// set shoeName
public void setShoeName(String shoeName) {
	this.shoeName = shoeName;
}

	// Get shoeSize
public Double getShoeSize() {
	return shoeSize;
}

	// Set shoeSize
public void setShoeSize(Double shoeSize) {
	this.shoeSize = shoeSize;
}


	// Get isNameBrandShoe
public Boolean getIsNameBrandShoe() {
	return isNameBrandShoe;
}

	// Set isNameBrandShoe
public void setIsNameBrandShoe(Boolean isNameBrandShoe) {
	this.isNameBrandShoe = isNameBrandShoe;
}

	// Display info function
public void displayShoeDetails() {
	System.out.print("Shoe Name: " + shoeName + "\n");
	System.out.print("Shoe Size: " + shoeSize  + "\n");
	System.out.print("Is it a name brand shoe? " + isNameBrandShoe  + "\n");
}

}
