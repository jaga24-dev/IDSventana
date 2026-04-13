package Ventana;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Ventana extends JFrame {
	public Ventana() {
		//ventana
		
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("ventana");
		// Cargar el ícono desde un archivo en tu proyecto
        ImageIcon icono = new ImageIcon("src/tax.png");
        setIconImage(icono.getImage());
		this.setBackground(Color.BLACK);
		this.setLocation(100,100);
		this.setLayout(null);
		
		
		
		this.menu();

		
		//this.calculadora_interes();
		//this.pintar();
		this.router("login");
		//this.registro();
		
		this.setVisible(true);
	}
	
	public void login() {
		//panel
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		this.add(contenedor);
		
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
		contenedor.add(registro);
		
		registro.addActionListener(e ->{
			System.out.println("Hola");
			System.out.println(e);
			this.router("registro");
		});
		
		//si no funciona el texto
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void recovery_password()
	{
		JTextField textField;
		JPasswordField passwordField;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255)); 
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(36, 186, 353, 81);
		lblNewLabel_8.setBorder(BorderFactory.createTitledBorder("Correo electrónico"));
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBackground(new Color(218, 230, 225));
		textField.setBounds(49, 211, 328, 42);
		panel.add(textField);
		textField.setBorder(new LineBorder(new Color(91, 253, 255), 1, true));
		textField.setBorder(null);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Iniciar proceso");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setBounds(36, 413, 341, 37);
		panel.add(btnNewButton);
		
		//boton para regresar al login
		JButton volver = new JButton("Volver");
		volver.setLocation(36, 460);
		volver.setSize(341, 37);
		volver.setFont(new Font("Arial",Font.BOLD,22));
		panel.add(volver);
				
		volver.addActionListener(e -> {
			this.router("login");
		});
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino ");
		lblNewLabel_1.setBounds(69, 73, 308, 16);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Recuperar contraseña");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_2_1.setBounds(49, 109, 340, 39);
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_2_1);
	
		
		this.add(panel);
	}
	
	public void registro() {
		//contenedor registro
		JPanel register_container = new JPanel();
		register_container.setBounds(50, 50, 500, 500);
		register_container.setLocation(600, 50);
		register_container.setOpaque(true);
		register_container.setBackground(Color.yellow);
		register_container.setLayout(null);
		this.add(register_container);
				
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
		register_container.add(cancelar);
		
		cancelar.addActionListener(e -> {
			this.router("login");
		});
		
		register_container.repaint();
		register_container.revalidate();
	}
	
	public void users() {
		JPanel users =new JPanel();
		users.setBounds(100,50, 1000,500);
		users.setBackground(Color.WHITE);
		users.setLayout(null);
		this.add(users);
		
		//Label
		JLabel users_tittle =new JLabel("USUARIOS");
		users_tittle.setBounds(150, 10,200, 30);
		users_tittle.setOpaque(true);
		users_tittle.setBackground(Color.BLACK);
	    users_tittle.setFont(new Font("Arial",Font.BOLD,22));
		users_tittle.setHorizontalAlignment(JLabel.CENTER);
		users.add(users_tittle);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add = new JButton("Agregar");
		add.setBounds(130,120,100,40);
		users.add(add);
		
		String [] table_head = {"No. Control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		
		String [][] table_content= {
				{"20231001","juan","perez garcia","2","90","Editar"},
				{"20231002","maria","gomez perez","4","100","Editar"},
				{"20231003","jose","palos gallardo","8","75","Editar"},
				{"20231004","pedro","cota meza","6","80","Editar"}
		};
		
		JTable users_table= new JTable(table_content, table_head);
		JScrollPane scrollPane= new JScrollPane(users_table);
		
		scrollPane.setBounds(30,180,800,100);
		users.add(scrollPane);
		
		//users.repaint();
	}
	
	public void test() {
		JPanel test_panel = new JPanel();
		test_panel.setSize(1000, 500);
		test_panel.setLocation(100, 50);
		test_panel.setBackground(Color.white);
		test_panel.setLayout(new BorderLayout(100,100));
		this.add(test_panel);
		
		JLabel users_title = new JLabel("USUARIOS"); 
		users_title.setFont(new Font("Arial",Font.BOLD,22));
		users_title.setBackground(Color.decode("#F27A61"));
		test_panel.add(users_title,BorderLayout.NORTH);
		
		JLabel users_title2 = new JLabel("USUARIOS2"); 
		users_title2.setFont(new Font("Arial",Font.BOLD,22));
		users_title2.setBackground(Color.decode("#F27A61"));
		test_panel.add(users_title2,BorderLayout.LINE_START);
		
		JLabel users_title3 = new JLabel("USUARIOS"); 
		users_title3.setFont(new Font("Arial",Font.BOLD,22));
		users_title3.setBackground(Color.decode("#F27A61"));
		test_panel.add(users_title3,BorderLayout.LINE_END);
		
		
		JPanel center_panel = new JPanel(); 
		center_panel.setBackground(Color.yellow);
		center_panel.setLayout(new GridLayout(4,4));
		
		center_panel.add(new JButton("1"));
		center_panel.add(new JButton("2"));
		center_panel.add(new JButton("3"));
		center_panel.add(new JButton("4"));
		center_panel.add(new JButton("5"));
		center_panel.add(new JButton("6"));
		center_panel.add(new JButton("1"));
		center_panel.add(new JLabel("2"));
		center_panel.add(new JButton("3"));
		center_panel.add(new JButton("4"));
		center_panel.add(new JButton("5"));
		center_panel.add(new JButton("6"));
		center_panel.add(new JTextField("3"));
		center_panel.add(new JButton("4"));
		center_panel.add(new JButton("5"));
		center_panel.add(new JButton("6"));
		
		test_panel.add(center_panel,BorderLayout.CENTER);
		
		
		JPanel south_panel = new JPanel();  
		south_panel.setBackground(Color.green);
		south_panel.setLayout(new FlowLayout(5,10,10));
		
		south_panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		south_panel.add(new JButton("1"));
		south_panel.add(new JButton("2"));
		south_panel.add(new JButton("3"));
		south_panel.add(new JButton("4"));
		south_panel.add(new JButton("5"));
		
		test_panel.add(south_panel,BorderLayout.SOUTH);;
	}
		
	public void calculadora() {
	    JPanel panelCalc = new JPanel();
	    panelCalc.setBounds(100, 50, 350, 450);
	    panelCalc.setBackground(Color.darkGray);
	    panelCalc.setLayout(new BorderLayout(10,10));
	    this.add(panelCalc);

	    // Pantalla
	    JLabel pantalla = new JLabel("0", SwingConstants.RIGHT);
	    pantalla.setFont(new Font("Consolas", Font.BOLD, 32));
	    pantalla.setOpaque(true);
	    pantalla.setBackground(Color.BLACK);
	    pantalla.setForeground(Color.GREEN);
	    panelCalc.add(pantalla, BorderLayout.NORTH);

	    // Botonera
	    JPanel panelBotones = new JPanel(new GridLayout(5,4,10,10));
	    String[] botones = {
	        "MC","M+","/","*",
	        "7","8","9","+",
	        "4","5","6","-",
	        "1","2","3","=",
	        "0",".","<--","C"
	    };

	    for (String texto : botones) {
	        JButton boton = new JButton(texto);
	        boton.setFont(new Font("Arial", Font.BOLD, 18));
	        boton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

	        if (texto.matches("[0-9]")) {
	            boton.setBackground(Color.LIGHT_GRAY);
	        } else if ("+-*/=".contains(texto)) {
	            boton.setBackground(Color.blue);
	            boton.setForeground(Color.WHITE);
	        } else if (texto.equals("MC") || texto.equals("M+") || texto.equals("MR") || texto.equals("M-")) {
	            boton.setBackground(Color.RED);
	            boton.setForeground(Color.WHITE);
	        } else {
	            boton.setBackground(Color.ORANGE);
	        }
	        panelBotones.add(boton);
	    }
	    panelCalc.add(panelBotones, BorderLayout.CENTER);
	}
	
	public void calculadora_interes() {
		//Panel principal
		JPanel test_panel = new JPanel();
		test_panel.setSize(500, 500);
		test_panel.setLocation(100, 50);
		test_panel.setBackground(Color.white);
		test_panel.setLayout(new BorderLayout(20,20));
		this.add(test_panel, BorderLayout.CENTER);
		
		//Label
		JLabel tittle =new JLabel("INTERESES");
		tittle.setFont(new Font("Arial",Font.BOLD,22));
		test_panel.add(tittle, BorderLayout.NORTH);
		
		// Panel de entrada (Centro/Oeste) con GridLayout
        JPanel entrada = new JPanel(new GridLayout(3,2,20,20));
        entrada.setBackground(Color.GREEN);

        entrada.add(new JLabel("Capital: "));
        JTextField campoCapital = new JTextField("1500");
        entrada.add(campoCapital);

        entrada.add(new JLabel("Tiempo: "));
        JTextField campoTiempo = new JTextField("2");
        entrada.add(campoTiempo);

        entrada.add(new JLabel("Tasa de interés: "));
        JTextField campoTasa = new JTextField("0.5");
        entrada.add(campoTasa);

        test_panel.add(entrada, BorderLayout.WEST);
		
     // Panel de botones (Centro) con FlowLayout
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botones.setBackground(Color.GREEN);
        ImageIcon cal = new ImageIcon("src/contabilidad.png");
        ImageIcon cancel = new ImageIcon("src/cancelar.png");
        JButton calcular = new JButton("Calcular",cal);
        JButton cancelar = new JButton("Cancelar",cancel);
        botones.add(calcular);
        botones.add(cancelar);

        test_panel.add(botones, BorderLayout.CENTER);
		
     // Panel de resultados (Sur) con GridLayout
        JPanel resultados = new JPanel(new GridLayout(2,2,20,20));
        resultados.setBackground(Color.PINK);

        resultados.add(new JLabel("Interés: "));
        JTextField campoInteres = new JTextField("315.00");
        resultados.add(campoInteres);

        resultados.add(new JLabel("Monto: "));
        JTextField campoMonto = new JTextField("1815");
        resultados.add(campoMonto);

        test_panel.add(resultados, BorderLayout.SOUTH);
	}
	
	public void pintar() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d=(Graphics2D)g;
                
                g2d.drawLine(0, 0, 100, 100);
                
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.RED);
                g2d.drawLine(200, 200, 500, 200);
                
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.green);
                g2d.drawOval(400, 100, 90, 30);
                
                g2d.setStroke(new BasicStroke(5));
                g2d.drawArc(300, 100, 100, 100, 90, 90);
                
                //x=200  100  300  y=100 300 500
                g2d.drawPolygon(new int[] {200,100,300}, new int[] {100,300,500}, 3);
                
                g2d.setColor(Color.orange);
                
                g2d.fillRect(500, 300, 100, 100);
                
                g2d.fillOval(400, 200, 100, 100);
                
                g2d.fillArc(300, 300, 100, 100, 0, 300);
                
                g2d.fillPolygon(new int[] {400,300,500}, new int[] {200,300,500}, 3);
                
                try {
                	BufferedImage image = ImageIO.read(new File("src/img/extraterrestre.png"));
                	g2d.drawImage(image,500,9,null);
                	
                }catch(IOException e){
                	e.printStackTrace();
                }
            }
        };
        pane.setSize(1200, 700);
        pane.setLocation(0, 0);
        this.add(pane);
	}
	
	public void router(String target) {		
		this.getContentPane().removeAll();
		
		if(target.equals("login")) 
			this.login();
		
		if(target.equals("registro")) 
			this.registro();
		
		if(target.equals("recovery"))
			this.recovery_password();
		
		if(target.equals("alta"))
			this.alta();
		
		if(target.equals("baja"))
			this.baja();
		
		if(target.equals("consultar"))
			this.consultar();
		
		if(target.equals("help_user"))
			this.help_user();
		
		if(target.equals("help_system"))
			this.help_system();
		
		if(target.equals("help_pass"))
			this.help_pass();
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	public void alta() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		//Label
		JLabel title_alta =new JLabel();
		title_alta.setText("ALTA USUARIO");
		title_alta.setSize(500, 30);
		title_alta.setOpaque(true);
		title_alta.setLocation(150, 10);
		title_alta.setBackground(Color.white);
		title_alta.setFont(new Font("Arial",Font.BOLD,22));
		title_alta.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_alta);
		this.add(contenedor);
		
		JTextField nombre = new JTextField("Nombre");
	    nombre.setBounds(100, 80, 300, 30);
	    contenedor.add(nombre);

	    JButton guardar = new JButton("Guardar");
	    guardar.setBounds(100, 130, 150, 40);
	    contenedor.add(guardar);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(260, 130, 150, 40);
	    volver.addActionListener(e -> router("login"));
	    contenedor.add(volver);
		
	}
	public void baja() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("BAJA USUARIO");
		title_login.setSize(500, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		this.add(contenedor);
	}
	public void consultar() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("CONSULTA USUARIO");
		title_login.setSize(500, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		this.add(contenedor);
		
		JTextField buscar = new JTextField("ID Usuario");
	    buscar.setBounds(100, 80, 300, 30);
	    contenedor.add(buscar);

	    JButton consultar = new JButton("Consultar");
	    consultar.setBounds(100, 130, 150, 40);
	    contenedor.add(consultar);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(260, 130, 150, 40);
	    volver.addActionListener(e -> router("login"));
	    contenedor.add(volver);
	}
	
	public void help_user() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("¿Cómo crear un usuario?");
		title_login.setSize(500, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		this.add(contenedor);
		
		JTextArea texto = new JTextArea("Para crear un usuario, llena el formulario de registro...");
	    texto.setBounds(50, 80, 400, 200);
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(200, 300, 150, 40);
	    volver.addActionListener(e -> router("login"));
	    contenedor.add(volver);
	}
	
	public void help_system() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("¿Cómo acceder al sistema?");
		title_login.setSize(500, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		this.add(contenedor);
		
		JTextArea texto = new JTextArea("Ingresa tu correo y contraseña en la vista de login...");
	    texto.setBounds(50, 80, 400, 200);
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(200, 300, 150, 40);
	    volver.addActionListener(e -> router("login"));
	    contenedor.add(volver);
	}
	
	public void help_pass() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160,610);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		
		
		//Label
		JLabel title_login =new JLabel();
		title_login.setText("¿Qué pasa si olvidé mi contraseña?");
		title_login.setSize(500, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		this.add(contenedor);
		
		JTextArea texto = new JTextArea("Usa la opción de recuperación de cuenta para restablecer tu contraseña...");
	    texto.setBounds(50, 80, 400, 200);
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(200, 300, 150, 40);
	    volver.addActionListener(e -> router("login"));
	    contenedor.add(volver);
	}
	public void menu() {
		JMenuBar barra=new JMenuBar();
		
		JMenu archivo= new JMenu("Archivo");
		
		JMenuItem open= new JMenuItem("Abrir");
		JMenuItem close= new JMenuItem("Cerrar");
		JMenuItem save= new JMenuItem("Guardar");
		JMenuItem newFile= new JMenuItem("Nuevo");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		
		barra.add(archivo);
		
		JMenu submenu= new JMenu("Otros");
		
		archivo.addSeparator();
		
		JMenuItem menuItem= new JMenuItem("An item in the submenu");
		
		submenu.add(menuItem);
		
		menuItem= new JMenuItem("Another item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		//barra navegacion de cuenta
		this.setJMenuBar(barra);
		JMenu cuenta_menu= new JMenu("Cuenta");
		
		JMenuItem login_item= new JMenuItem("LoginView");
		JMenuItem register_item= new JMenuItem("RegistroView");
		
		login_item.addActionListener(e ->{
			this.router("login");
		});
		
		register_item.addActionListener(e ->{
			this.router("registro");
		});
		
		JMenuItem recover_item = new JMenuItem("RecuperacionView");
		recover_item.addActionListener(e->{
			this.router("recovery");
		});
		
		cuenta_menu.add(login_item);
		cuenta_menu.add(register_item);
		cuenta_menu.add(recover_item);
		
		barra.add(cuenta_menu);
		
		//menu usuario
		JMenu Usuario_menu= new JMenu("Usuario");
		JMenuItem alta_item= new JMenuItem("AltaUsuarioView");
		//JMenuItem baja_item= new JMenuItem("Baja");
		
		alta_item.addActionListener(e ->{
			this.router("alta");
		});
		
		/*baja_item.addActionListener(e ->{
			this.router("baja");
		});*/
		
		JMenuItem consultar_item = new JMenuItem("ConsultarUsuarioView");
		consultar_item.addActionListener(e->{
			this.router("consultar");
		});
		Usuario_menu.add(alta_item);
		//Usuario_menu.add(baja_item);
		Usuario_menu.add(consultar_item);
		barra.add(Usuario_menu);
		
		//menu ayuda
		JMenu Ayuda_menu= new JMenu("Ayuda");
		JMenuItem helpuser_item= new JMenuItem("AyudaCrearUsuarioView");
		JMenuItem helpsystem_item= new JMenuItem("AyudaAccesoSistemaView");
				
		helpuser_item.addActionListener(e ->{
			this.router("help_user");
		});
				
		helpsystem_item.addActionListener(e ->{
			this.router("help_system");
		});
				
		JMenuItem helppass_item = new JMenuItem("AyudaRecuperarContraseñaView");
		helppass_item.addActionListener(e->{
			this.router("help_pass");
		});
		Ayuda_menu.add(helpuser_item);
		Ayuda_menu.add(helpsystem_item);
		Ayuda_menu.add(helppass_item);
		barra.add(Ayuda_menu);
	}
}

