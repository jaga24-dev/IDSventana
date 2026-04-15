package Ventana;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana3 {

	private JFrame frame;
	private JButton[] casillas = new JButton[9];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 window = new Ventana3();
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
	public Ventana3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Juego de Gato");
        frame.setBounds(100, 100, 450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Panel superior con marcador y tiempo
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBackground(new Color(230, 230, 250));
        frame.add(panelSuperior, BorderLayout.NORTH);

        JLabel lblTiempo = new JLabel("Tiempo: 0:00", SwingConstants.CENTER);
        lblTiempo.setFont(new Font("Arial", Font.BOLD, 16));
        panelSuperior.add(lblTiempo, BorderLayout.NORTH);

        JPanel marcador = new JPanel(new GridLayout(1, 2));
        JLabel lblX = new JLabel("X: 0", SwingConstants.CENTER);
        lblX.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel lblO = new JLabel("O: 0", SwingConstants.CENTER);
        lblO.setFont(new Font("Arial", Font.BOLD, 18));
        marcador.add(lblX);
        marcador.add(lblO);
        panelSuperior.add(marcador, BorderLayout.CENTER);

        // Panel central con botones del tablero
        JPanel panelTablero = new JPanel(new GridLayout(3, 3, 5, 5));
        panelTablero.setBackground(Color.LIGHT_GRAY);
        frame.add(panelTablero, BorderLayout.CENTER);

        for (int i = 0; i < 9; i++) {
            casillas[i] = new JButton("");
            casillas[i].setFont(new Font("Arial", Font.BOLD, 36));
            panelTablero.add(casillas[i]);
        }

        // Panel inferior con botón reiniciar
        JPanel panelInferior = new JPanel();
        frame.add(panelInferior, BorderLayout.SOUTH);

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        panelInferior.add(btnReiniciar);
	}

}
