package tarea04_c;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tarea04_C
        extends JFrame {

    public Tarea04_C() {
        JLabel lblSaludo = new JLabel("Hola Mundo.");
        JLabel lblSaludo2 = new JLabel("¿Hola que tal que pasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa?.");
        add(lblSaludo);
        lblSaludo.setBounds(2, 28, 116, 24);
        add(lblSaludo2);
        lblSaludo2.setBounds(2, 50, 116, 24);
        this.setSize(400, 300);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Tarea04_C tarea04_C = new Tarea04_C();
    }
}
