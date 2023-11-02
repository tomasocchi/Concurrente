/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Tomas
 */
public class main6 {
    public static void main(String[] arg){
        Taxi tacho = new Taxi();
        Taxista tachero = new Taxista(tacho);
        Cliente6[] cl = new Cliente6[30]; 
        
        for(int i = 0; i < 30; i++){
            cl[i] = new Cliente6(tacho); 
        }
        tachero.start();
        
        for(int i=0; i <30; i++){
            cl[i].start();
        }
    }
    
}
