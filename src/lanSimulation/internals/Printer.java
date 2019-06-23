package lanSimulation.internals;


/** Subclase para nodos de tipo Printer
 * 
 * @author Miguel Díaz, Eric Berlinches
 *
 */
public class Printer extends Node{
	
	public Printer(String name){
		super(name);
	}
	
	public Printer(String name, Node nextNode){
		super(name, nextNode);
	}
	
	@Override
	public String printType() {
		return "Printer";
	}
}
