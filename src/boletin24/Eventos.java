/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jdominguezmartinan
 */
public class Eventos implements ActionListener
{
    JFrame marco;
   JPanel panel;
   JButton bDibuxar;
   JButton bLimpar;
   JTextField numeros;
   JLabel circulo;
   boolean dibuxado=false;
   
    public Eventos(){
       marco=new JFrame("debuxar circulos");
       panel=new JPanel();
       bDibuxar=new JButton("Dibuxar");
       bLimpar=new JButton("Limpar");
       numeros=new JTextField("8");

       marco.setSize(400,200);
       panel.add(bDibuxar);
       panel.add(bLimpar);
       panel.add(numeros);
       marco.add(panel);
       bDibuxar.addActionListener(this);
       bLimpar.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
    

    @Override
    public void actionPerformed(ActionEvent e)
    {
       Graphics g=panel.getGraphics();
       Object boton=e.getSource();
       if(boton==bDibuxar){
           g.setColor(Color.red);
           int circulos=Integer.parseInt(numeros.getText());
           for (int i=0;i<circulos;i++){
               int x=(int)(Math.random()*100)+60;
               int y=(int)(Math.random()*100)+80;
               g.drawOval(x,y,200,200);
           }
       }else if(boton==bLimpar){
           panel.paint(g);
       }
    }

    
    
}
