package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Models.User;

public class UsersView extends JFrame{
	private JTable tablaUsuarios;
    private JScrollPane scrollPane;
    
	public UsersView() {
        setTitle("Lista de Usuarios");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        tablaUsuarios = new JTable();
        scrollPane = new JScrollPane(tablaUsuarios);

        add(scrollPane, BorderLayout.CENTER);
    }
	public void tableUsers(ArrayList<User> usuarios) {
		//TODO esta vista muestra todos los usuarios
		
		DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Email");
        modelo.addColumn("Teléfono");

        for (User u : usuarios) {
            modelo.addRow(new Object[]{
                u.getId(),
                u.getName(),
                u.getLast_name(),
                u.getEmail(),
                u.getPhone()
            });
        }

        tablaUsuarios.setModel(modelo);
	}
}
