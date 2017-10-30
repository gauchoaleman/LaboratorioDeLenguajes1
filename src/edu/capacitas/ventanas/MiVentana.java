package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {

    public MiVentana() {
        super("Titulo ventana desde constructor");
        setSize(400,500);
        initComponentes();
    }

    private void initComponentes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("nombre");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("saludar");
        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);
    }

    public MiVentana(String title,int width,int height) {
        setTitle(title);
        setSize(width, height);
        initComponentes();
    }
}
