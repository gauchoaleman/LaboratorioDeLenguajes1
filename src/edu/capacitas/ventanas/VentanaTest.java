package edu.capacitas.ventanas;

import javax.swing.*;

public class VentanaTest {

    public static void main(String args[]){
        MiVentana miventana = new MiVentana();
        miventana.setVisible(true);

        MiVentana miventana2 = new MiVentana("Titulo ventana",200,180);
        miventana2.setVisible(true);
    }

}
