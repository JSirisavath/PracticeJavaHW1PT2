package App;
import Models.Shoe;
import Models.Car;
import Models.Pizza;
import Models.Student;
import Models.Television;

public class ClassesDemo {

	public static void main(String[] args) {
		// Shoe object show case
		Shoe shoeOne = new Shoe("Jordan 11", 9.0, true);
		
		shoeOne.displayShoeDetails();
		
		
		// Car object
		Car car = new Car("Lamborghini", "Black", 11.11);
		
		// setting a new color
		car.setColor("Purple");
		
		car.displayCarDetails();
		
		
		// Pizza object
		
		Pizza pizza = new Pizza("Peperoni", "Cheese","Mushrooms", 15.00);
		
		pizza.displayPizza();
		
		
		// Student object
		System.out.print("\n");
		Student studentOne = new Student("Jay Sirisavath", "ABC11");
		
		studentOne.displayStudentInfo();
		
		System.out.print("\n");
		Television tv = new Television(50.0, 750.00);
		
		tv.displayTVInfo();
				
	}

}
