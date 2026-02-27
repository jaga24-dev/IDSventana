package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
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


public class Ventana extends JFrame {
	public Ventana() {
		//ventana
		
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
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
		
		this.users();
		
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
		//contenedor.revalidate();
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
}

