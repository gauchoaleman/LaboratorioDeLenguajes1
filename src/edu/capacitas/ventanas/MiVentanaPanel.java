package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentanaPanel extends JFrame {
    public MiVentanaPanel(){
        super("Ejemplo Jpanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,200);

        //panel de fecha
        JPanel panelFecha = new JPanel(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));

        //panel de datos
        JPanel panelDatos = new JPanel(new GridLayout(3,2,0,5));
        panelDatos.add(new JLabel("Nombre: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI: "));
        panelDatos.add(new JTextField(15));
        panelDatos.add(new JLabel("Fecha de nacimiento: "));
        panelDatos.add(panelFecha);

        //panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(new JButton("aceptar"));
        panelBotones.add(new JButton("cancelar"));

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelDatos, BorderLayout.CENTER);
        container.add(panelBotones, BorderLayout.SOUTH);
    }
}
