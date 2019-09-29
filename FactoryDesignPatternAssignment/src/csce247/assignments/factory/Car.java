package csce247.assignments.factory;

/**
 * @author Cameron Brandenburg
 * A type of Toy that is a Car
 */
public class Car extends Toy{

	/**
	 * Constructor that sets the name of the toy to "Car"
	 */
	public Car() {
		name = "Car";
	}
	
	/**
	 * Overrides the superclass' assemble method by first calling it and then printing
	 * out information about the assembly of the car
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Make the body\n"
				+ "Add the wheels\n"
				+ "Paint the car");
	}
}
