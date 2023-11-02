/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Mirador {
    Semaphore escalon = new Semaphore(1); 
    Semaphore tobogan = new Semaphore(2); 
    Semaphore tirarse = new Semaphore(0); 
    
    public void subirseMirador() throws InterruptedException{
        escalon.acquire();
        System.out.println("un visitante se sube al escalon");
        escalon.release();

    }
    
    public void Solicitartirarse() throws InterruptedException{
        tobogan.acquire();
    }
    
    public void bajar(){
        tirarse.release();
    }
       
    public void controlarTobogan() throws InterruptedException{
        tirarse.acquire();
    }
    
    public void dejarTirarse(){
     System.out.println("El encargado permite que un visitante se tire por un tobogan");
     tobogan.release();
    }
}
