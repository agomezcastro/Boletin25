package boletin25_ej4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author agomezcastro
 */
public class Ventana4 implements ActionListener{
    JFrame marco;
    JFrame marco2;
    JPanel panel;
    JButton boton;
    
    
    public void crearVentana(){
        marco = new JFrame("Ventá 1");
        marco2 = new JFrame("Ventá 2");
        panel = new JPanel();
        boton = new JButton("Nueva Ventana");
        
        
        boton.addActionListener(this);
        panel.add(boton);
        marco.setSize(400, 100);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        marco2.setSize(200, 200);
        marco2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        marco2.setVisible(true);
    }
}
