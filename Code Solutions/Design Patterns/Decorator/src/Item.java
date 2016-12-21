/**
 * @author Nitinkumar Gove
 */
public abstract class Item {
	private String description = "Item";
	
	public void printDescription(){
		System.out.println(description);
	}
	
	public abstract double cost();

}
