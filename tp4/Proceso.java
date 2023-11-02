/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Tomas
 */
public class Proceso extends Thread{
    private char ca;
    private GeneradorTurnos ge; 
    
    public Proceso(GeneradorTurnos gt, char c){
        ca = c; 
        ge = gt; 
    }
    
    public void run(){
         for(int i = 0; i <3; i++){
             ge.turno(ca); 
         }   
    }  
}
