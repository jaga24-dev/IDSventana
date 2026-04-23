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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Ventana3 {

	private JFrame frame;
	private BotonGato[][] tablero = new BotonGato[3][3];
    private boolean turnoX = true;
    private JLabel lblX, lblO;
    private int puntosX = 0, puntosO = 0;
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
        lblX = new JLabel("X: 0", SwingConstants.CENTER);
        lblX.setFont(new Font("Arial", Font.BOLD, 18));
        lblO = new JLabel("O: 0", SwingConstants.CENTER);
        lblO.setFont(new Font("Arial", Font.BOLD, 18));
        marcador.add(lblX);
        marcador.add(lblO);
        panelSuperior.add(marcador, BorderLayout.CENTER);

        // Panel central con botones del tablero
        JPanel panelTablero = new JPanel(new GridLayout(3, 3, 5, 5));
        panelTablero.setBackground(Color.LIGHT_GRAY);
        frame.add(panelTablero, BorderLayout.CENTER);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = new BotonGato(i, j);
                int fila = i, col = j;
                tablero[i][j].addActionListener(e -> jugar(tablero[fila][col]));
                panelTablero.add(tablero[i][j]);
            }
        }

        // Panel inferior con botón reiniciar
        JPanel panelInferior = new JPanel();
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        btnReiniciar.addActionListener(e -> reiniciarTablero());
        panelInferior.add(btnReiniciar);
        frame.add(panelInferior, BorderLayout.SOUTH);
	}
	
	private void jugar(BotonGato boton) {
        String jugador;
		if(turnoX) jugador = "X";
		else jugador = "O";
        boton.marcar(jugador);

        if (verificarGanador(jugador)) {
            if (jugador.equals("X")) {
                puntosX++;
                lblX.setText("X: " + puntosX);
            } else {
                puntosO++;
                lblO.setText("O: " + puntosO);
            }
            JOptionPane.showMessageDialog(frame, "¡Ganó " + jugador + "!");
            reiniciarTablero();
            return;
        }

        if (tableroLleno()) {
            JOptionPane.showMessageDialog(frame, "¡Empate!");
            reiniciarTablero();
            return;
        }
        turnoX = !turnoX; // cambiar turno
    }
	
	private boolean verificarGanador(String jugador) {
        // filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].getEstado().equals(jugador) &&
                tablero[i][1].getEstado().equals(jugador) &&
                tablero[i][2].getEstado().equals(jugador)) return true;

            if (tablero[0][i].getEstado().equals(jugador) &&
                tablero[1][i].getEstado().equals(jugador) &&
                tablero[2][i].getEstado().equals(jugador)) return true;
        }
        // diagonales
        if (tablero[0][0].getEstado().equals(jugador) &&
            tablero[1][1].getEstado().equals(jugador) &&
            tablero[2][2].getEstado().equals(jugador)) return true;

        if (tablero[0][2].getEstado().equals(jugador) &&
            tablero[1][1].getEstado().equals(jugador) &&
            tablero[2][0].getEstado().equals(jugador)) return true;

        return false;
    }
	
	private boolean tableroLleno() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[i][j].getEstado().equals("")) return false;
        return true;
    }

    private void reiniciarTablero() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                tablero[i][j].reiniciar();
        turnoX = true;
    }
    
}
