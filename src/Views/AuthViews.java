package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controllers.AuthController;


public class AuthViews {
	
	private AuthController control;
	
	public AuthViews(AuthController control) { 
		//this.menu(); 
		//this.router("registro");
		
		this.control = control;
	}
	
	public void loginview() {
		
		JFrame ventana = new JFrame();
		ventana.setSize(1200, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("ventana");
		// Cargar el ícono desde un archivo en tu proyecto
	    ImageIcon icono = new ImageIcon("src/tax.png");
	    ventana.setIconImage(icono.getImage());
	    ventana.setBackground(Color.BLACK);
	    ventana.setLocation(100,100);
	    ventana.setLayout(null);
		
		//panel
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		ventana.add(contenedor);
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel user_tag=new JLabel("Correo Electronico");
		user_tag.setBounds(40, 120, 300, 30);
		user_tag.setFont(new Font("Arial",Font.BOLD,17));
		contenedor.add(user_tag);
		
		//Texto
		JTextField username= new JTextField();
		username.setSize(300, 30);
		username.setLocation(30,150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JLabel user_pass=new JLabel("Contraseña");
		user_pass.setBounds(40, 180, 300, 30);
		user_pass.setFont(new Font("Arial",Font.BOLD,17));
		contenedor.add(user_pass);
		
		JTextField userpass= new JTextField();
		userpass.setSize(300, 30);
		userpass.setLocation(30,210);
		userpass.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(userpass);
		
		//Boton
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(200, 400);
		acceder.setSize(180, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		acceder.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username_val=username.getText();
				String userpass_val=userpass.getText();
				if(username_val.equals("")) {
					username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else
					username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				
				if(userpass_val.equals("")) {
					userpass.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else
					userpass.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				
			}
		});
		
		//Boton
		JButton registro = new JButton("¿Aun no tienes cuenta?");
		registro.setLocation(200, 460);
		registro.setSize(200, 50);
		registro.setFont(new Font("Arial",Font.BOLD,22));
		
		registro.addActionListener(e ->{
			ventana.dispose();
			control.register();
		});
		
		contenedor.add(registro);
		
		ventana.add(contenedor);
		
		ventana.setVisible(true);
		
	}
	
}
