package Colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentaUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Cesar", "00001", 20000);
		Cliente cl2 = new Cliente("Mario", "00002", 40000);
		Cliente cl3 = new Cliente("Jason", "00003", 30000);
		Cliente cl4 = new Cliente("Penelope", "00004", 10000);
		Cliente cl5 = new Cliente("Cesar G", "00005", 60000);
		Cliente cl6 = new Cliente("Cesar G", "00005", 60000);
		//Crear la Coleccion...Objetos de tipo CLiente en la coleccion.
		//NO se puede repetir clientes...plantearse si se haran muchas operaciones de borrar/agregar
		Set<Cliente>clientesBanco = new HashSet<Cliente>();
		//Agregar los clientes.
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		clientesBanco.add(cl6);
		//Recorrer la coleccion.
		for (Cliente cliente : clientesBanco) {
			System.out.println("Cliente: "+cliente.getNombre()+" / N* de Cuenta: "+cliente.getN_Cuenta()+" / Saldo: "+cliente.getSaldo());
		}
		//Usando un Iterador
		//iterador sera igual a lo que la coleccion devuelva
		//Iterator<Cliente>it = clientesBanco.iterator();
		//while(it.hasNext()) {
		//	String nombreCliente = it.next().getNombre();
		//	System.out.println("Nombre: "+nombreCliente);
		//}//
		//eliminar
		Iterator<Cliente>it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombreCliente = it.next().getNombre();
			if(nombreCliente.equals("Mario")) {
				it.remove();
			}//
		}//
		//
		System.out.println("---------------------");
		for (Cliente cliente : clientesBanco) {
			System.out.println("Cliente: "+cliente.getNombre()+" / N* de Cuenta: "+cliente.getN_Cuenta()+" / Saldo: "+cliente.getSaldo());
		}
		
		
	}

}
