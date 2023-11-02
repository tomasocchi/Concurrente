/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Comer {
    public Comer(){
        
    }
    public synchronized void comer() throws InterruptedException{
        System.out.println("El hamster "+Thread.currentThread().getName()+" esta comiendo");
        Thread.sleep(2000);
        System.out.println("El hamster "+Thread.currentThread().getName()+" terminó de comer");
    }
}
