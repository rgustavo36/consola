/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * @author Administrador
 */

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanas extends JFrame{
 
    private Frame frame = new Frame();
    private Panel panel = new Panel();
    private Button boton = new Button("Pulse para cerrar");
 
    public void ventanas(){
        frame.setTitle("APLICACION");//añadir titulo al marco
        panel.setLayout(new GridBagLayout());//cambiar el layout del panel
       
        panel.add(boton); //añadir el boton al panel
        frame.add(panel);//añadir el panel al marco
        
        int ancho=100, alto=100;//indicar tamaño del marco
        frame.setSize(ancho, alto);
        frame.setLocationRelativeTo(null);//centrar
        frame.setVisible(true);//visibilidad del marco
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void windows(){
        Label label = new Label();
        Label label1 =new Label();
        JTextField caja = new JTextField();
        
        this.setTitle("APLICACION");
        this.setSize(250, 250);
        this.setLocation(100, 100);
       // this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        label.setText("Numero 1: ");
        label.setBounds(10, 10, 100, 20);
        this.getContentPane().add(label);
        
        caja.setText("0");
        caja.setBounds(10, 10, 100, 30);
        this.getContentPane().add(caja);
    }
    
    public static void main(String[] args){    
        ventanas v=new ventanas();
       // v.ventanas();
        v.windows();
    }
   

  
}
