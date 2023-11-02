/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */

public class Cliente3 extends Thread{
    private GestorImpresoras gi; 
    private char tipo; 
    
    public Cliente3(GestorImpresoras g, char t){
        gi = g;
        tipo = t;
    }
    
    public void run(){
        try {
            gi.solicitarImpresion(tipo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
