package boletin25_ej3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author agomezcastro
 */
public class Ventana3 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton boton;
    JButton boton2;
    JLabel etiqueta;
    JLabel etiqueta2;
    
    
    public void crearVentana(){
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton = new JButton("Saúdo");
        boton2 = new JButton("Despedida");
        etiqueta = new JLabel();
        
        
        boton.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton);
        panel.add(etiqueta);
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
            etiqueta.setText("Un saúdo a DAM");
        else
            etiqueta.setText("Fin do programa");
    }
}
