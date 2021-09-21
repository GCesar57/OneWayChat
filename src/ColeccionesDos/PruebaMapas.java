package ColeccionesDos;

import java.util.HashMap;
import java.util.Map;



public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<"Clave", "Valor">
		HashMap<String, Empleado>Personal = new HashMap<String, Empleado>();
		Personal.put("145", new Empleado("Cesar"));
		Personal.put("144", new Empleado("Antonio"));
		Personal.put("146", new Empleado("Giron"));
		Personal.put("147", new Empleado("Arguerta"));
		//
		System.out.println(Personal);
		System.out.println("----------------");
		Personal.remove("146");
		System.out.println(Personal);
		System.out.println("----------------");
		//System.out.println(Personal.entrySet());
		for(Map.Entry<String, Empleado>entrada : Personal.entrySet()) {
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave: "+clave+", Valor: "+valor);
		}//
	}

}
//
class Empleado{
	//
	private String nombre;
	private double sueldo;
	//
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = 2000;
	}
	//
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
}//