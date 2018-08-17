/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video99;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author gleez
 */
public class Video99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FrameSpinner mimarco = new FrameSpinner(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
   
class FrameSpinner extends JFrame{
    public FrameSpinner(){
        
        setBounds(500,400,550,350); 
   
        
        add(new LaminaSpinner()); 
        
        setVisible(true);
    }
    
}

class LaminaSpinner extends JPanel{
    
    public LaminaSpinner(){
       
        //String lista[] = {"Enero", "Febrero", "Marzo", "Abril"}; 
        
        JSpinner control = new JSpinner(new MiModeloJspinner()); 
        Dimension d = new Dimension(200,20); 
        control.setPreferredSize(d);
        add(control); 
        
    }
    
    private class MiModeloJspinner extends SpinnerNumberModel{
        
        public MiModeloJspinner(){
            super(5,0,10,1);
        }
        public Object getNextValue(){
            return super.getPreviousValue(); 
        }
    public Object getPreviousValue(){
        return super.getNextValue(); 
    }
    }
    
}
