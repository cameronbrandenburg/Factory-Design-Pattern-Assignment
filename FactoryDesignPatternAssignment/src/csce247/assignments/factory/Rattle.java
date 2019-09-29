package csce247.assignments.factory;

/**
 * @author Cameron Brandenburg
 * A type of Toy that is a Doll
 */
public class Rattle extends Toy{

	/**
	 * Constructor that sets the name of the toy to "Rattle"
	 */
	public Rattle() {
		name = "Rattle";
	}
	
	/**
	 * Overrides the superclass' assemble method by first calling it and then printing
	 * out information about the assembly of the rattle
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame\n"
				+ "Add the pebbles\n"
				+ "Secure the sides");
	}
}
