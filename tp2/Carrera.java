/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Tomas
 */
public class Carrera {
    public static void main(String[] args){
        Corredor[] arr = new Corredor[4];
        Corredor c1 = new Corredor("Raul");
        Corredor c2 = new Corredor("Anibal");
        Corredor c3 = new Corredor("Tomasitoo");
        Corredor c4 = new Corredor("German");
        
        arr[0] = c1; 
        arr[1] = c2;
        arr[2] = c3;
        arr[3] = c4;

        Thread t1 = new Thread(c1); 
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
       
        t1.start();
        t2.start();
        t3.start();
        t4.start(); 
        
    }
}
