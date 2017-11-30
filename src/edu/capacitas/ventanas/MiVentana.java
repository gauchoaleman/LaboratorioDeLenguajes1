package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {

    private JTextField textField;

    public MiVentana() {
        super("Titulo ventana desde constructor");
        setSize(600,200);
        initComponentes();
    }

    private void initComponentes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("nombre");
        textField = new JTextField(20);
        JButton button = new JButton("saludar");
        button.addActionListener(new EventoSaludo(textField));


        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);

        class EventoSaludoDos implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hola, " + textField.getText() + "!");
            }
        }
    }

    public MiVentana(String title,int width,int height) {
        setTitle(title);
        setSize(width, height);
        initComponentes();
    }
}
