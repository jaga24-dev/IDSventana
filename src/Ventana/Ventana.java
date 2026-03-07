package Ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


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
		
		this.setJMenuBar(barra);
		
		this.calculadora_interes();
		
		this.setVisible(true);
	}
	
	public void login() {
		//panel
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.BLACK);
		contenedor.setSize(500,500);
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
		
		//Texto
		JTextField username= new JTextField();
		username.setSize(300, 30);
		username.setLocation(30,150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		//Boton
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(200, 400);
		acceder.setSize(180, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		//si no funciona el texto
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registro() {
		//contenedor registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(650, 50);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#27F5D6"));
		register_container.setLayout(null);
		this.add(register_container);
		
		//Label
		JLabel bio_tag =new JLabel("Bibliografia");
		bio_tag.setBounds(100, 100, 250, 40);
		bio_tag.setOpaque(true);
		bio_tag.setBackground(Color.white);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(bio_tag);
		
		JTextArea bio= new JTextArea();
		bio.setBounds(120,160,250,120);
		register_container.add(bio);
		
		JCheckBox sweet_option= new JCheckBox("Dulce");
		sweet_option.setBounds(120, 330, 100, 50);
		register_container.add(sweet_option);
		
		JCheckBox salty_option= new JCheckBox("Salado");
		salty_option.setBounds(220, 330, 100, 50);
		register_container.add(salty_option);
		
		JCheckBox healthy= new JCheckBox("Saludable");
		healthy.setBounds(320, 330, 100, 50);
		register_container.add(healthy);
		
		JRadioButton accept_terms= new JRadioButton("Acepto los terminos");
		accept_terms.setBounds(120, 400, 150, 50);
		register_container.add(accept_terms);
		
		JRadioButton reject_terms= new JRadioButton("Rechazo los terminos");
		reject_terms.setBounds(290, 400, 150, 50);
		register_container.add(reject_terms);
		
		ButtonGroup terms=new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		
		String [] colonias = {"Camino real","La fuente","Villas"};
		JComboBox list= new JComboBox(colonias);
		list.setBounds(50, 50, 200, 60);
		register_container.add(list);
		
		register_container.repaint();
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

}

