/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Tomas
 */
public class main7 {
    public static void main(String[] args) {
        Mirador m = new Mirador(); 
        Encargado e = new Encargado(m); 
        Visitante[] v = new Visitante[9]; 
        
        for (int i = 0; i < 9; i++) {
            v[i] = new Visitante(m, "Visitante "+i); 
        }
        
        e.start();
        for (int i = 0; i < 9; i++) {
            v[i].start();
        }
        
    }
}
