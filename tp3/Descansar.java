/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Descansar {
    public Descansar(){
        
    }
    public synchronized void descansar() throws InterruptedException{ 
        System.out.println("El hamster "+Thread.currentThread().getName()+" esta durmiendo");
        Thread.sleep(3000);
        System.out.println("El hamster "+Thread.currentThread().getName()+" se despertó");
    }
}
