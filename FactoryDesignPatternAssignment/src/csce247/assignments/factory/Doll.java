package csce247.assignments.factory;

/**
 * @author Cameron Brandenburg
 * A type of Toy that is a Doll
 */
public class Doll extends Toy{

	/**
	 * Constructor that sets the name of the toy to "Doll"
	 */
	public Doll() {
		name = "Doll";
	}
	
	/**
	 * Overrides the superclass' assemble method by first calling it and then printing
	 * out information about the assembly of the doll
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Connecting all pieces\n"
				+ "Painting the face\n"
				+ "Adding the dress\n"
				+ "Adding the shoes");
	}
}
