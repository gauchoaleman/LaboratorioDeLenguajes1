package edu.capacitas.eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonPulsado implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        boton.setText("Gracias!¡!");
    }
}