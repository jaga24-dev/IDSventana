package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JCheckBox;

public class ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 window = new ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	    frame.setBounds(100, 100, 900, 500);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(new BorderLayout());

	    // Título
	    JPanel tituloPanel = new JPanel();
	    JLabel titulo = new JLabel("Registro de usuarios");
	    titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
	    titulo.setForeground(Color.RED);
	    tituloPanel.add(titulo);
	    frame.getContentPane().add(tituloPanel, BorderLayout.NORTH);
	    
	    //panel datos
	    JPanel panel = new JPanel();
	    panel.setForeground(new Color(0, 128, 255));
	    frame.getContentPane().add(panel, BorderLayout.WEST);
	    panel.setLayout(new GridLayout(0, 1, 2, 2));
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setForeground(new Color(0, 128, 255));
	    panel.add(panel_4);
	    panel_4.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblNewLabel = new JLabel("Datos generales");
	    lblNewLabel.setBackground(new Color(0, 128, 255));
	    lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    panel_4.add(lblNewLabel, BorderLayout.NORTH);
	    
	    JPanel panel_5 = new JPanel();
	    panel_5.setBackground(new Color(0, 128, 255));
	    panel_4.add(panel_5, BorderLayout.CENTER);
	    panel_5.setLayout(new GridLayout(6, 2, 2, 2));
	    
	    JLabel lblNewLabel_1 = new JLabel("Nombre:");
	    lblNewLabel_1.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_1);
	    
	    textField = new JTextField();
	    panel_5.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblNewLabel_2 = new JLabel("Apellido paterno:");
	    lblNewLabel_2.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_2);
	    
	    textField_1 = new JTextField();
	    panel_5.add(textField_1);
	    textField_1.setColumns(10);
	    
	    JLabel lblNewLabel_3 = new JLabel("Apellido materno:");
	    lblNewLabel_3.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_3);
	    
	    textField_2 = new JTextField();
	    panel_5.add(textField_2);
	    textField_2.setColumns(10);
	    
	    JLabel lblNewLabel_4 = new JLabel("Fecha de nacimiento:");
	    lblNewLabel_4.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_4);
	    
	    textField_3 = new JTextField();
	    panel_5.add(textField_3);
	    textField_3.setColumns(10);
	    
	    JLabel lblNewLabel_6 = new JLabel("Nacionalidad");
	    lblNewLabel_6.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_6);
	    String [] paises = {"México","Perú","Chile"};
	    JComboBox comboBox = new JComboBox(paises);
	    panel_5.add(comboBox);
	    
	    
	    JLabel lblNewLabel_5 = new JLabel("Sexo:");
	    lblNewLabel_5.setForeground(new Color(255, 255, 255));
	    panel_5.add(lblNewLabel_5);
	    
	    JPanel panel_6 = new JPanel();
	    panel_6.setBackground(new Color(0, 128, 255));
	    panel_5.add(panel_6);
	    panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
	    rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 11));
	    rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
	    panel_6.add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
	    rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD, 11));
	    rdbtnNewRadioButton_1.setBackground(new Color(0, 128, 255));
	    panel_6.add(rdbtnNewRadioButton_1);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setForeground(new Color(0, 128, 255));
	    panel.add(panel_3);
	    panel_3.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblNewLabel_7 = new JLabel("Datos opcionales");
	    lblNewLabel_7.setBackground(new Color(0, 128, 255));
	    lblNewLabel_7.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    panel_3.add(lblNewLabel_7, BorderLayout.NORTH);
	    
	    JPanel panel_7 = new JPanel();
	    panel_7.setBackground(new Color(0, 128, 255));
	    panel_3.add(panel_7, BorderLayout.CENTER);
	    panel_7.setLayout(new GridLayout(2, 2, 5, 5));
	    
	    JLabel lblNewLabel_8 = new JLabel("Descripcion:");
	    lblNewLabel_8.setForeground(new Color(255, 255, 255));
	    panel_7.add(lblNewLabel_8);
	    
	    JLabel lblNewLabel_9 = new JLabel("Actividades:");
	    lblNewLabel_9.setForeground(new Color(255, 255, 255));
	    panel_7.add(lblNewLabel_9);
	    
	    JTextArea textArea = new JTextArea();
	    panel_7.add(textArea);
	    
	    JList list = new JList<>(new String[]{"Tejer","Senderismo","Pintar","Películas","Leer"});
	    panel_7.add(list);
	    
	    //panel perfil
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(0, 128, 64));
	    panel_1.setForeground(new Color(255, 128, 128));
	    frame.getContentPane().add(panel_1, BorderLayout.EAST);
	    panel_1.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblNewLabel_10 = new JLabel("Perfil de usuario");
	    lblNewLabel_10.setBackground(new Color(255, 255, 255));
	    lblNewLabel_10.setFont(new Font("Arial Black", Font.PLAIN, 11));
	    panel_1.add(lblNewLabel_10, BorderLayout.NORTH);
	    
	    ImageIcon user = new ImageIcon("src/persona.png");
	    JLabel lblNewLabel_11 = new JLabel(user);
	    panel_1.add(lblNewLabel_11, BorderLayout.CENTER);
	    
	    JPanel panel_8 = new JPanel();
	    panel_1.add(panel_8, BorderLayout.SOUTH);
	    panel_8.setLayout(new GridLayout(2, 1));
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
	    chckbxNewCheckBox.setBackground(new Color(0, 128, 64));
	    panel_8.add(chckbxNewCheckBox);
	    
	    JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
	    chckbxNewCheckBox_1.setBackground(new Color(0, 128, 64));
	    panel_8.add(chckbxNewCheckBox_1);
	    
	    //panel botones
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 128, 0));
	    frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
	    panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
	    
	    ImageIcon nuevo = new ImageIcon("src/boton-agregar.png");
	    ImageIcon guardar = new ImageIcon("src/disquete.png");
	    ImageIcon salir = new ImageIcon("src/cerrar-sesion.png");
	    
	    JButton btnAgregar = new JButton("Nuevo",nuevo);
	    btnAgregar.setHorizontalAlignment(SwingConstants.LEFT);
	    panel_2.add(btnAgregar);
	    
	    JButton btnGuardar = new JButton("Guardar",guardar);
	    panel_2.add(btnGuardar);
	    
	    JButton btnSalir = new JButton("Salir",salir);
	    panel_2.add(btnSalir);
		
	    
	}

}
