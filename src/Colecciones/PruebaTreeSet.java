package Colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TreeSet<String>ordernaPersonas = new TreeSet<String>();
		 * ordernaPersonas.add("Sally"); ordernaPersonas.add("Ardnold");
		 * ordernaPersonas.add("Bryan"); ordernaPersonas.add("Amanda"); // for (String s
		 * : ordernaPersonas) { System.out.println(ordernaPersonas); }
		 */
		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(2, "segundo articulo");
		Articulo tercero = new Articulo(3, "tercer articulo");
		Articulo cuarto = new Articulo(4, "cuarto articulo");
		//
		TreeSet<Articulo>ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(cuarto);
		ordenaArticulos.add(segundo);
		//
		for (Articulo art: ordenaArticulos) {
			System.out.println(art.getDescripccion());
		}
		//
		System.out.println("------------------");
		Articulo comparadorArticulo = new Articulo();
		//Crear TreeSet
		TreeSet<Articulo>ordenaArticulo2 = new TreeSet<Articulo>(comparadorArticulo);
		ordenaArticulo2.add(tercero);
		ordenaArticulo2.add(primero);
		ordenaArticulo2.add(cuarto);
		ordenaArticulo2.add(segundo);
		for (Articulo articuloDos : ordenaArticulo2) {
			System.out.println(articuloDos.getDescripccion());
		}//
	}
	//

}
//Clase que implementara mas de una interfaz...
class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
	private int numArticulo;
	private String descripccion;
	//Constructor
	public Articulo() {}//
	public Articulo(int num, String desc) {
		this.numArticulo = num;
		this.descripccion = desc;
	}//
	
	public int getNumArticulo() {
		return numArticulo;
	}

	public String getDescripccion() {
		return descripccion;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numArticulo - o.numArticulo;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descripcionA = o1.getDescripccion();
		String descripcionB = o2.getDescripccion();
		return descripcionA.compareTo(descripcionB);
	}
	
}//