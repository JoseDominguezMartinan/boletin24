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
   
    public Eventos(){
       marco=new JFrame("Primeira ventá");
       panel=new JPanel();
       bDibuxar=new JButton("Dibuxar");
       bLimpar=new JButton("Limpar");
       numeros=new JTextField("0");

       marco.setSize(400,200);
       panel.add(bDibuxar);
       panel.add(bLimpar);
       panel.add(numeros);
       marco.add(panel);
       bDibuxar.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
      g.fillOval(105, 70, 100, 100);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }

    
    
}
