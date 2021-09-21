package Colecciones;

public class LibroUso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro myLibro = new Libro("Lord of the Rings", "JRR Tolkien", 45435);
		Libro myLibro2 = new Libro("Lord of the Rings", "JRR Tolkien", 45435);
		if(myLibro.equals(myLibro2)) {
			System.out.println("Es el mismo libro");
			System.out.println(myLibro.hashCode());
			System.out.println(myLibro2.hashCode());
		}else {
			System.out.println("NO Es el mismo libro");
			System.out.println(myLibro.hashCode());
			System.out.println(myLibro2.hashCode());
		}
	}

}
