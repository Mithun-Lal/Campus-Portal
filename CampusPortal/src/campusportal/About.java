/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusportal;

/**
 *
 * @author mithunlal
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class About extends JPanel {
    int x=330,y=400;
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Campus Portal",x,y);
        y=y+25;
        g.drawString("Developers",x,y);
        y=y+20;
        g.drawString("Mithun Lal",x,y);
        y=y+15;
        g.drawString("Eldo Baby",x,y);
        y=y+15;
        g.drawString("Vishnu G Prasad",x,y);
        y=y+15;
        g.drawString("Abhishek Sah",x,y);
        y=y+15;
        g.drawString("Muhammed Faizal",x,y);
        y=y+15;
        g.drawString("Jasil Ummer",x,y);
        try
        {
            Thread.sleep(1000);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
  
        y-=150;
        repaint();
       
    }
   

    
}

