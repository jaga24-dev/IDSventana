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

import Models.AuthModel;

public class AuthViews {
	
	private AuthModel model;
	
	public AuthViews() { 
		//this.menu(); 
		//this.router("registro");
		
		//model = new AuthModel();
		loginview();
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
			registerView();
		});
		
		contenedor.add(registro);
		
		ventana.add(contenedor);
		
		ventana.setVisible(true);
		
	}
	
	public void registerView() {
		
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
		
		//contenedor registro
		JPanel register_container = new JPanel();
		register_container.setBounds(50, 50, 500, 500);
		register_container.setLocation(600, 50);
		register_container.setOpaque(true);
		register_container.setBackground(Color.yellow);
		register_container.setLayout(null);
		ventana.add(register_container);
				
		// Título 
		JLabel titulo = new JLabel("REGISTRO", JLabel.CENTER);
		titulo.setBounds(100, 10, 300, 40);
		titulo.setFont(new Font("Arial", Font.BOLD, 28));
		titulo.setForeground(Color.BLACK); register_container.add(titulo);
				
		// Nombre de usuario 
		JLabel user_tag = new JLabel("NOMBRE DE USUARIO:"); 
		user_tag.setBounds(100, 60, 250, 30); 
		user_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(user_tag);

		JTextField new_user = new JTextField(); 
		new_user.setBounds(100, 90, 300, 30);
		new_user.setFont(new Font("Arial", Font.PLAIN, 14));
		new_user.setForeground(Color.GRAY);
		register_container.add(new_user);

		// BIO 
		JLabel bio_tag = new JLabel("BIO"); 
		bio_tag.setBounds(100, 130, 250, 30); 
		bio_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(bio_tag); 
				
		JTextArea bio = new JTextArea(); 
		bio.setBounds(100, 160, 300, 100);
		bio.setFont(new Font("Arial", Font.PLAIN, 14)); 
		bio.setForeground(Color.GRAY); 
		bio.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		register_container.add(bio);
				
		// Preferencias 
		JLabel pref_tag = new JLabel("PREFERENCIAS", JLabel.CENTER); 
		pref_tag.setBounds(100, 270, 250, 30); 
		pref_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(pref_tag); 
				
		JCheckBox sweet_option = new JCheckBox("Dulces"); 
		sweet_option.setBounds(100, 300, 100, 30); 
		sweet_option.setBackground(Color.decode("#27F5D6")); 
		register_container.add(sweet_option);
				
		JCheckBox salty_option = new JCheckBox("Salado"); 
		salty_option.setBounds(200, 300, 100, 30); 
		salty_option.setBackground(Color.decode("#27F5D6")); 
		register_container.add(salty_option); 
				
		JCheckBox healthy = new JCheckBox("Saludable"); 
		healthy.setBounds(300, 300, 120, 30); 
		healthy.setBackground(Color.decode("#27F5D6")); 
		register_container.add(healthy);
				
		sweet_option.setBackground(Color.yellow);
		salty_option.setBackground(Color.yellow);
		healthy.setBackground(Color.yellow);
				
		// Términos 
		JLabel terms_tag = new JLabel("TÉRMINOS", JLabel.CENTER); 
		terms_tag.setBounds(100, 340, 250, 30); 
		terms_tag.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(terms_tag); 
				
		JRadioButton accept_terms = new JRadioButton("Acepto los términos"); 
		accept_terms.setBounds(100, 370, 150, 30);
		accept_terms.setBackground(Color.yellow); 
		register_container.add(accept_terms);
				
		JRadioButton reject_terms = new JRadioButton("Rechazo los términos");
		reject_terms.setBounds(250, 370, 150, 30); 
		reject_terms.setBackground(Color.yellow); 
		register_container.add(reject_terms);
				
		ButtonGroup terms=new ButtonGroup();
		accept_terms.setBackground(Color.yellow);
		reject_terms.setBackground(Color.yellow);
		terms.add(accept_terms);
		terms.add(reject_terms);
				
		// Dropdown de colonias 
		String[] colonias = {"Camino Real", "La Fuente", "Villas"}; 
		JComboBox<String> list = new JComboBox<>(colonias);
		list.setBounds(150, 400, 200, 30); 
		register_container.add(list); 
				
		// Botón 
		JButton crearCuenta = new JButton("Crear cuenta"); 
		crearCuenta.setBounds(100, 440, 200, 40);
		crearCuenta.setFont(new Font("Arial", Font.BOLD, 20));
		crearCuenta.setBackground(Color.YELLOW); 
		crearCuenta.setForeground(Color.BLACK); 
		register_container.add(crearCuenta);
		
		crearCuenta.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username_val=new_user.getText();
				String userbio_val=bio.getText();
				if(username_val.equals("")) {
					new_user.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else
					new_user.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				
				if(userbio_val.equals("")) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else
					bio.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				// Validación de términos
		        if(!accept_terms.isSelected()) {
		            accept_terms.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		            accept_terms.setBorderPainted(true);
		        } else {
		            accept_terms.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		            accept_terms.setBorderPainted(true);
		        }
		        
		     // Validación de preferencias
		        if(!healthy.isSelected()) {
		            healthy.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		            healthy.setBorderPainted(true);
		        } else {
		            healthy.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		            healthy.setBorderPainted(true);
		        }
			}
		});
		
		//boton para regresar al login
		JButton cancelar = new JButton("Volver");
		cancelar.setLocation(310, 440);
		cancelar.setSize(150, 40);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		
		
		cancelar.addActionListener(e -> {
			ventana.dispose();
			loginview();
		});
		
		register_container.add(cancelar);
		
		ventana.add(register_container);
		
		ventana.setVisible(true);
		
	}
}
