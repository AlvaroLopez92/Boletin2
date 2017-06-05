/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float celsius,fahrenheit,kelvin,convcelsius,convfahrenheit;
        
        celsius = Float.parseFloat(JOptionPane.showInputDialog("celsius"));
        convfahrenheit = 
        
        
        kelvin = (float) (celsius+273.15);
        fahrenheit = (float) ((celsius*1.8)+32);
                
        System.out.print(kelvin);
        System.out.print(fahrenheit);
    }
    
}
