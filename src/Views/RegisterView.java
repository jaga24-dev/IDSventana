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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controllers.AuthController;
import Models.AuthModel;
import Models.User;

public class RegisterView {
	
	private AuthController control;
	private AuthModel model;
	private UsersView parent;
	
	public RegisterView(UsersView parent) {
	    this.parent = parent;
	    parent=new UsersView();
	}
	public RegisterView(AuthController control) {
        this.control = control;
        model=new AuthModel();
    }
	public void registro() {
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
				
		// Nombre
		JLabel nombreField = new JLabel("Nombre:"); 
		nombreField.setBounds(100, 60, 250, 30); 
		nombreField.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(nombreField);

		JTextField new_user = new JTextField(); 
		new_user.setBounds(100, 90, 300, 30);
		new_user.setFont(new Font("Arial", Font.PLAIN, 14));
		new_user.setForeground(Color.GRAY);
		register_container.add(new_user);
		
		// ---------- Campo Correo ----------
		JLabel correoPanel = new JLabel("Correo electrónico");
	    correoPanel.setFont(new Font("Arial", Font.BOLD, 18));
	    correoPanel.setBounds(100, 130, 300, 30); 
	    register_container.add(correoPanel);

	    JTextField correoField = new JTextField();
	    correoField.setBounds(100, 160, 300, 30);
	    correoField.setFont(new Font("Arial", Font.PLAIN, 14));
	    correoField.setForeground(Color.GRAY);
	    correoPanel.add(correoField);

	    register_container.add(correoField);
	    
	 // ---------- Campo Contraseña ----------
	    JLabel pass = new JLabel("Contraseña");
	    pass.setFont(new Font("Arial", Font.BOLD, 18));
	    pass.setBounds(100, 200, 300, 30); 
	    register_container.add(pass);

	    JPasswordField passwordField = new JPasswordField();
	    passwordField.setBounds(100, 230, 300, 30);
	    passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
	    passwordField.setForeground(Color.GRAY);
	    register_container.add(passwordField);
	    
	 // ultimo Nombre
	    JLabel ultilabel = new JLabel("Ultimo nombre:"); 
	    ultilabel.setBounds(100, 270, 300, 30); 
	    ultilabel.setFont(new Font("Arial", Font.BOLD, 18)); 
	 	register_container.add(ultilabel);

	 	JTextField ultiField = new JTextField(); 
	 	ultiField.setBounds(100, 300, 300, 30);
	 	ultiField.setFont(new Font("Arial", Font.PLAIN, 14));
	 	ultiField.setForeground(Color.GRAY);
	 	register_container.add(ultiField);
	 	
	 // ultimo Nombre
	    JLabel Phonelabel = new JLabel("Telefono:"); 
	    Phonelabel.setBounds(100, 340, 300, 30); 
	    Phonelabel.setFont(new Font("Arial", Font.BOLD, 18)); 
	 	register_container.add(Phonelabel);

	 	JTextField phoneField = new JTextField(); 
	 	phoneField.setBounds(100, 370, 300, 30);
	 	phoneField.setFont(new Font("Arial", Font.PLAIN, 14));
	 	phoneField.setForeground(Color.GRAY);
	 	register_container.add(phoneField);
				
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
				boolean valido = true;

		        String nombre = new_user.getText().trim();
		        String correo = correoField.getText().trim();
		        String password = new String(passwordField.getPassword()).trim();
		        String ultinombre = ultiField.getText().trim();
		        String telefono = phoneField.getText().trim();

		        if (nombre.isEmpty()) {
		            nombreField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (correo.isEmpty() || !correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
		            correoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (password.isEmpty() || password.length() < 5) {
		            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }
		        
		        if (ultinombre.isEmpty()) {
		        	ultiField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		        	ultiField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }
		        
		        if (telefono.isEmpty() || telefono.length() < 10) {
		        	phoneField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		        	phoneField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (valido) {
		        	User u = new User();
		            u.setName(nombre);
		            u.setLast_name(ultinombre);
		            u.setEmail(correo);
		            u.setPhone(telefono);
		            u.setPassword(password);
		        	if( u.registrarUsuario(u) ) {
		        		JOptionPane.showMessageDialog(
		    	                null,
		    	                "Registro exitoso\n\n" +
		    	                "Nombre: " + nombre + "\n" +
		    	                "Correo: " + correo + "\n" +
				        		"Contraseña: " + password + "\n" +
				        		"Ultimo nombre: " + ultinombre + "\n" +
						        "Telefono: " + telefono,
		    	                "Éxito",
		    	                JOptionPane.INFORMATION_MESSAGE
		    	           );
			            ventana.dispose();
			            parent.cargarTabla(); // refrescar tabla
		        	}
		        	else {
		                JOptionPane.showMessageDialog(null, "Error al registrar usuario");
		            }
		            
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
			parent.cargarTabla();
		});
		
		register_container.add(cancelar);
		
		ventana.add(register_container);
		
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
				
		// Nombre
		JLabel nombreField = new JLabel("Nombre:"); 
		nombreField.setBounds(100, 60, 250, 30); 
		nombreField.setFont(new Font("Arial", Font.BOLD, 18)); 
		register_container.add(nombreField);

		JTextField new_user = new JTextField(); 
		new_user.setBounds(100, 90, 300, 30);
		new_user.setFont(new Font("Arial", Font.PLAIN, 14));
		new_user.setForeground(Color.GRAY);
		register_container.add(new_user);
		
		// ---------- Campo Correo ----------
		JLabel correoPanel = new JLabel("Correo electrónico");
	    correoPanel.setFont(new Font("Arial", Font.BOLD, 18));
	    correoPanel.setBounds(100, 130, 300, 30); 
	    register_container.add(correoPanel);

	    JTextField correoField = new JTextField();
	    correoField.setBounds(100, 160, 300, 30);
	    correoField.setFont(new Font("Arial", Font.PLAIN, 14));
	    correoField.setForeground(Color.GRAY);
	    correoPanel.add(correoField);

	    register_container.add(correoField);
	    
	 // ---------- Campo Contraseña ----------
	    JLabel pass = new JLabel("Contraseña");
	    pass.setFont(new Font("Arial", Font.BOLD, 18));
	    pass.setBounds(100, 200, 300, 30); 
	    register_container.add(pass);

	    JPasswordField passwordField = new JPasswordField();
	    passwordField.setBounds(100, 230, 300, 30);
	    passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
	    passwordField.setForeground(Color.GRAY);
	    register_container.add(passwordField);
	    
	 // ultimo Nombre
	    JLabel ultilabel = new JLabel("Ultimo nombre:"); 
	    ultilabel.setBounds(100, 270, 300, 30); 
	    ultilabel.setFont(new Font("Arial", Font.BOLD, 18)); 
	 	register_container.add(ultilabel);

	 	JTextField ultiField = new JTextField(); 
	 	ultiField.setBounds(100, 300, 300, 30);
	 	ultiField.setFont(new Font("Arial", Font.PLAIN, 14));
	 	ultiField.setForeground(Color.GRAY);
	 	register_container.add(ultiField);
	 	
	 // ultimo Nombre
	    JLabel Phonelabel = new JLabel("Telefono:"); 
	    Phonelabel.setBounds(100, 340, 300, 30); 
	    Phonelabel.setFont(new Font("Arial", Font.BOLD, 18)); 
	 	register_container.add(Phonelabel);

	 	JTextField phoneField = new JTextField(); 
	 	phoneField.setBounds(100, 370, 300, 30);
	 	phoneField.setFont(new Font("Arial", Font.PLAIN, 14));
	 	phoneField.setForeground(Color.GRAY);
	 	register_container.add(phoneField);
				
		// Preferencias 
		/*JLabel pref_tag = new JLabel("PREFERENCIAS", JLabel.CENTER); 
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
		register_container.add(list); */
				
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
				boolean valido = true;

		        String nombre = new_user.getText().trim();
		        String correo = correoField.getText().trim();
		        String password = new String(passwordField.getPassword()).trim();
		        String ultinombre = ultiField.getText().trim();
		        String telefono = phoneField.getText().trim();

		        if (nombre.isEmpty()) {
		            nombreField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (correo.isEmpty() || !correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
		            correoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (password.isEmpty() || password.length() < 5) {
		            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		            passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }
		        
		        if (ultinombre.isEmpty()) {
		        	ultiField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		        	ultiField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }
		        
		        if (telefono.isEmpty() || telefono.length() < 10) {
		        	phoneField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		            valido = false;
		        } else {
		        	phoneField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		        }

		        if (valido) {
		        	String resultado = model.registro(correo, password, nombre, ultinombre, telefono);
		        	if( resultado.equals("exito") ) {
		        		JOptionPane.showMessageDialog(
		    	                null,
		    	                "Registro exitoso\n\n" +
		    	                "Nombre: " + nombre + "\n" +
		    	                "Correo: " + correo + "\n" +
				        		"Contraseña: " + password + "\n" +
				        		"Ultimo nombre: " + ultinombre + "\n" +
						        "Telefono: " + telefono,
		    	                "Éxito",
		    	                JOptionPane.INFORMATION_MESSAGE
		    	           );
		        		//router("login");
			            ventana.dispose();
						control.login();
		        	}
		        	if( resultado.equals("duplica") ) {
		        		correoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		        		JOptionPane.showMessageDialog(null, "El correo ya está registrado", "Error", JOptionPane.WARNING_MESSAGE);
		        	}
		        	
		        	if( resultado.equals("general") ) {
		        		 JOptionPane.showMessageDialog(null, "Error inesperado. Intente más tarde.", "Error", JOptionPane.ERROR_MESSAGE);
		        	}
		            
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
			control.login();
		});
		
		register_container.add(cancelar);
		
		ventana.add(register_container);
		
		ventana.setVisible(true);
		
	}
}
