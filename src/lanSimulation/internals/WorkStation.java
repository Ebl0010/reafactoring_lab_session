package lanSimulation.internals;

import lanSimulation.Network;

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
	
	/**
	 * @param buf
	 * @param currentNode
	 */
	@Override
	public void printOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
		Node currentNode = this;
		do {
			buf.append("Workstation ");
			buf.append(this.name_);
			buf.append(" [Workstation]");
			buf.append(" -> ");
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append(" ... ");
	}
	
	/**
	Write a HTML representation of #receiver on the given #buf.
	<p><strong>Precondition:</strong> isInitialized();</p>
	 * @param network
	 * @param buf
	 */
	@Override
	public void printHTMLOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		buf.append("<HTML>\n<HEAD>\n<TITLE>LAN Simulation</TITLE>\n</HEAD>\n<BODY>\n<H1>LAN SIMULATION</H1>");
		Node currentNode = this;
		buf.append("\n\n<UL>");
		do {
			buf.append("\n\t<LI> ");
			buf.append("Workstation ");
			buf.append(this.name_);
			buf.append(" [Workstation]");
			buf.append(" </LI>");
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append("\n\t<LI>...</LI>\n</UL>\n\n</BODY>\n</HTML>\n");
	}
	
	/**
	Write an XML representation of #receiver on the given #buf.
	<p><strong>Precondition:</strong> isInitialized();</p>
	 * @param network
	 * @param buf
	 */
	@Override
	public void printXMLOn (Network network, StringBuffer buf) {
		assert network.isInitialized();
	
		Node currentNode = this;
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<network>");
		do {
			buf.append("\n\t");
			buf.append("<workstation>");
			buf.append(currentNode.name_);
			buf.append("</workstation>");
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append("\n</network>");
	}
	
}
