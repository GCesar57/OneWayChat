package Sockets;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoServidor mimarco=new MarcoServidor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
}//
//
//Para que la clase este a la escucha, implementara Runnable
//Se crea el metodo Run(), luego se crea el Thread..
class MarcoServidor extends JFrame implements Runnable {
	private	JTextArea areatexto;
	//
	public MarcoServidor(){
		setBounds(1200,300,280,350);				
		JPanel milamina= new JPanel();
		milamina.setLayout(new BorderLayout());
		areatexto=new JTextArea();
		milamina.add(areatexto,BorderLayout.CENTER);
		add(milamina);
		setVisible(true);
		//Thread en el Constructor...
		Thread miHilo = new Thread(this);
		miHilo.start();
	}//
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Codigo que estara a la escucha...
		//System.out.println("Estoy a la escicha...");
		try {
			ServerSocket servidor = new ServerSocket(999);
			while(true) {
				//Aceptar cualquier conexion que venga del exterior
				Socket miSocket = servidor.accept();
				//Crear un flujo de entrada...que usara como medio de transporte el socket miSocket.getInputStream()
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				//Leer lo que viene en el flujo de entrada...
				String mensajeTexto = flujoEntrada.readUTF();
				//mostrarlo por pantalla con un salto de linea...
				areatexto.append("\n"+mensajeTexto);
				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//El servidor, tendra que recibir el texto enviado desde el cliente y permanecer a la escucha y tener el puerto abierto.
//Abrir el puerto indicado 999 y dejarlo a la escucha, usando la clase serverSocket
//La clase serverSocket tiene un metodo accept(); que devuelve un objeto de tipo socket, el metodo escucha a una
//conexion y hace que se acepte esa conexion, pone a la escucha la aplicacion...