package boletin25_ej2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author agomezcastro
 */
public class Ventana2 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton boton;
    JButton boton2;
    
    
    public void crearVentana(){
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton = new JButton("Programación");
        boton2 = new JButton("Bases de datos");
        
        boton.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton);
        panel.add(boton2);
        marco.setSize(400, 100);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obx= e.getSource();
        if(obx == boton)
            marco.setTitle("Programación");
        else
            marco.setTitle("Bases de datos");
    }
}
