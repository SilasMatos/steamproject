/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class GameFrame extends JFrame implements ActionListener{

    GamePanel pan;
    JButton reset;
    
    public GameFrame(){        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,800);
        this.setTitle("Snake");
        this.setResizable(false);
        //this.pack();        
        this.setLocationRelativeTo(null);
        reset = new JButton("Clique aqui para reiniciar");
        reset.setSize(200, 100);
        reset.setLocation(200, 650);
        reset.addActionListener(this);     
        pan = new GamePanel();
        this.add(reset); 
        //this.addKeyListener(pan.m);
        this.add(pan); 
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==reset) {
            this.remove(pan);
            pan = new GamePanel();
            this.add(pan);
            pan.requestFocusInWindow();
            SwingUtilities.updateComponentTreeUI(this.pan);
        }
    }
    
}
