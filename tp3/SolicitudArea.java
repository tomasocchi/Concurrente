/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class SolicitudArea extends Thread{
    
    private String area; 
    private int lugar; 
    private int cantidad;
    Sistema sis; 
    
    public SolicitudArea(String a, int lug, int cant, Sistema s){
        area = a; 
        lugar = lug; 
        cantidad = cant; 
        sis = s; 
    }
    
    public void run(){
       try{
           sis.realizarReserva(area, lugar, cantidad); 
           Thread.sleep(100);
       }catch(InterruptedException e){
           Logger.getLogger(SolicitudArea.class.getName()).log(Level.SEVERE, null, e);
       }
    }

}
