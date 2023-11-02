/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class RuedaDeJugar {
    public RuedaDeJugar(){
        
    }
    public synchronized void jugarRueda() throws InterruptedException{
        System.out.println("El Hamster "+Thread.currentThread().getName()+" esta jugando con la Rueda");
        Thread.sleep(1000);
        System.out.println("El hamster "+Thread.currentThread().getName()+" terminó de jugar");
    }

}
