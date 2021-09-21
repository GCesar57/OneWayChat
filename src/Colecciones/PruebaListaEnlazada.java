package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear primera lista enlazada...
		LinkedList<String>paises = new LinkedList<String>();
		paises.add("El Salvador");
		paises.add("Brasil");
		paises.add("Mexico");
		paises.add("Ecuador");
		//Segunda linked list de capitales...
		LinkedList<String>capitales = new LinkedList<String>();
		capitales.add("San Salvador");
		capitales.add("Brasilia");
		capitales.add("DF");
		capitales.add("Quito");
		//Crear el iterador...
		ListIterator<String>itPais = paises.listIterator();
		ListIterator<String>itCapital = capitales.listIterator();
		//Agregar en la primera lista lo que hay en la segunda...
		while(itCapital.hasNext()) {
			//Comprobar si hay un elemento en la lista de los paises
			if(itPais.hasNext()) {
				itPais.next(); //Saltar al siguiente elemento
			}//
			//Agregar el siguiente elemento
			itPais.add(itCapital.next());
		}//
		System.out.println(paises);
		//Vuelve a la posicion inicial. Imprimir los pares de capitales.
		itCapital = capitales.listIterator();
		while(itCapital.hasNext()) {
			itCapital.next();
			if(itCapital.hasNext()) {
				itCapital.next();
				itCapital.remove();
			}//
		}//
		System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
	}

}
