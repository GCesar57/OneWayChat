package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		LinkedList<String>personas = new LinkedList<String>();
		personas.add("Pepe");
		personas.add("Mario");
		personas.add("Cesar");
		personas.add("Anna");
		personas.add("Malcom");
		System.out.println(""+personas.size());
		ListIterator<String>it = personas.listIterator();
		it.next();
		it.add("Mariana");
		for (String persona : personas) {
			System.out.println(persona);
		}
	}
}
