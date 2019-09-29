package csce247.assignments.factory;

/**
 * @author Cameron Brandenburg
 * The factory for all toys. Orders all toy types.
 */
public class ToyStore {

	/**
	 * Orders a new toy of the type you input (doll, car, or rattle)
	 * @param type The type of toy you want to order
	 * @return The new toy ordered
	 */
	public Toy orderToy(String type) {
		Toy toy;
		
		if (type.equals("doll")) {
			toy = new Doll();
		}
		else if (type.equals("car")) {
			toy = new Car();
		}
		else {
			toy = new Rattle();
		}
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
}
