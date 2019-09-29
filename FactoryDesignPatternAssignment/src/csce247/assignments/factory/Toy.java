package csce247.assignments.factory;

public class Toy {

	/**
	 * Name of the toy
	 */
	protected String name;
	
	/**
	 * Prints out a message that the toy was assembled
	 */
	public void assemble() {
		System.out.println("Putting together a " + name);
	}
	
	/**
	 * Prints out a message that the toy was put in a box
	 */
	public void boxToy() {
		System.out.println("Putting the " + name + " in a box");
	}
	
	/**
	 * Prints out a message that the price of the toy was added
	 */
	public void priceToy() {
		System.out.println("Adding price on " + name);
	}
}
