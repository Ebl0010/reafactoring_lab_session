package lanSimulation.internals;


/** Subclase para nodos de tipo WorkStation
 * 
 * @author Miguel Díaz, Eric Berlinches
 *
 */
public class WorkStation extends Node{
	
	public WorkStation(String name){
		super(name);
	}
	
	public WorkStation(String name, Node nextNode){
		super(name, nextNode);
	}
	
	@Override
	public String printType() {
		return "Workstation";
	}
	
	
	
	
	
}
