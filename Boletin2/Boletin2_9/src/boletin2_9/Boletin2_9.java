/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float dinero,billetes100,billetes20,billetes5,monedas1;
        
        dinero = Float.parseFloat(JOptionPane.showInputDialog("dinero"));
        
        billetes100 = (dinero*100);
        billetes20 = (dinero*20);
        billetes5 = (dinero*5);
        monedas1 = (dinero*1);
        
        System.out.println(billetes100);
        System.out.println(billetes20);
        System.out.println(billetes5);
        System.out.println(monedas1);
    }
    
}
