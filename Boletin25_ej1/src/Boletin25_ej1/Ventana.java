package Boletin25_ej1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author agomezcastro
 */
public class Ventana implements ActionListener{
        JFrame marco;
        JPanel panel;
        JButton boton;
        JLabel etiqueta;
        
        
     public void crearVentana(){   
         marco = new JFrame();
         panel = new JPanel();
         boton = new JButton("Preme");
         etiqueta = new JLabel();
         
         
         boton.addActionListener(this);
         panel.add(boton);
         panel.add(etiqueta);
         marco.setSize(400, 400);
         marco.add(panel);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         marco.setVisible(true);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Premeches o botón");
    }
}
