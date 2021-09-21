package Colecciones;

public class Libro {
	private String nombre;
	private String autor;
	private int ISBM;
	//
	public Libro(String nombre, String autor, int iSBM) {
		this.nombre = nombre;
		this.autor = autor;
		ISBM = iSBM;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getISBM() {
		return ISBM;
	}
	public void setISBM(int iSBM) {
		ISBM = iSBM;
	}
	//
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", ISBM=" + ISBM + "]";
	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Libro) {
//			Libro otro = (Libro)obj;
//			if(this.ISBM == otro.ISBM) {
//				return true;
//			}else {
//				return false;
//			}//
//		}else {
//			return false;
//		}
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBM;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBM != other.ISBM)
			return false;
		return true;
	}
	
	
}
