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
	private DefaultTableModel modelo;
    private JButton btnNuevo;
    private JScrollPane scrollPane;
    
	public UsersView() {
        setTitle("Lista de Usuarios");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        modelo = new DefaultTableModel(new Object[]{"ID","Nombre","Apellido","Email","Teléfono"}, 0);
        tablaUsuarios = new JTable(modelo);
        add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER);
        
        btnNuevo = new JButton("Nuevo Registro");
        add(btnNuevo, BorderLayout.SOUTH);

        btnNuevo.addActionListener(e -> {
            RegisterView rv = new RegisterView(this);
            rv.registro();
            cargarTabla();
        });

        cargarTabla();
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
	public void cargarTabla() {
        modelo.setRowCount(0); // limpiar
        User u = new User();
        ArrayList<User> usuarios = u.get();
        for (User usr : usuarios) {
            modelo.addRow(new Object[]{
                usr.getId(), usr.getName(), usr.getLast_name(), usr.getEmail(), usr.getPhone()
            });
        }
        tablaUsuarios.setModel(modelo);
    }
}
