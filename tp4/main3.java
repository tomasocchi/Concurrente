/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Tomas
 */
public class main3 {
    public static void main(String[] args){
        GeneradorTurnos gt = new GeneradorTurnos(); 
        Proceso p1 = new Proceso(gt, 'a'); 
        Proceso p2 = new Proceso(gt, 'b');
        Proceso p3 = new Proceso(gt, 'c');
        p1.setName("Hilo 1"); 
        p2.setName("Hilo 2");
        p3.setName("Hilo 3");
        p1.start();
        p2.start();
        p3.start();
    }
}
