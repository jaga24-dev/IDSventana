package Ventana;

import java.awt.Font;

import javax.swing.JButton;


class BotonGato extends JButton {
 private int fila;
 private int columna;
 private String estado; // "", "X", "O"

 public BotonGato(int fila, int columna) {
     this.fila = fila;
     this.columna = columna;
     this.estado = "";
     setFont(new Font("Arial", Font.BOLD, 36));
     setFocusPainted(false);
 }

 public int getFila() { return fila; }
 public int getColumna() { return columna; }
 public String getEstado() { return estado; }

 public void marcar(String jugador) {
     this.estado = jugador;
     setText(jugador);
     setEnabled(false); // evita sobreescribir
 }

 public void reiniciar() {
     this.estado = "";
     setText("");
     setEnabled(true);
 }
}
