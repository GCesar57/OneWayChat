package Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cliente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//

}
//
class MarcoCliente extends JFrame{
	public MarcoCliente(){
		setBounds(600,300,280,350);
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		add(milamina);
		setVisible(true);
	}//	
}
//
class LaminaMarcoCliente extends JPanel{
	private JTextField campo1;
	private JButton miboton;
	//
	public LaminaMarcoCliente(){
		JLabel texto=new JLabel("CLIENTE");
		add(texto);
		campo1=new JTextField(20);
		add(campo1);		
		miboton=new JButton("Enviar");
		add(miboton);	
		//Crear instancia de la clase interna para poner el boton a la escucha...
		EnviaTexto miEvento = new EnviaTexto();
		miboton.addActionListener(miEvento);		
	}//
private class EnviaTexto implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println(campo1.getText());
		//CREAR EL SOCKET...
		try {
			Socket miSocket = new Socket("192.168.1.14", 999);
			//Flujo de datos de salida...getOutputStream 
			//Se le debe indicar a DataOutputStream();, por donde va a circular usando el socket y el metodo getOutputStream
			DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
			//indicarle al output que es lo que va a circular...en el flujoSalida, va a viajar lo que este en campo1.getText(); 
			flujoSalida.writeUTF(campo1.getText());
			campo1.setText("");
			//cerrar el flujo
			flujoSalida.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	//
}//	
	
}//