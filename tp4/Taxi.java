/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Taxi {
    Semaphore mutex = new Semaphore(1); 
    Semaphore taxista = new Semaphore(0);
    Semaphore taxi = new Semaphore(1); 
    Semaphore subirse = new Semaphore(0);
    
  
    public void solicitarViaje() throws InterruptedException{
        mutex.acquire();
        taxista.release();
    }
    
    public void realizarViaje() throws InterruptedException{
        System.out.println("Taxista mimiendo");
        taxista.acquire();
    }
    
    public void dejarIr() throws InterruptedException{        
        subirse.release();
    }
     
    
    public void irse() throws InterruptedException{
        subirse.acquire();
        mutex.release();
         
    }
     
    public void terminaViaje() throws InterruptedException{
        taxi.release();
    }
    
    public void viajando() throws InterruptedException{
        taxi.acquire();
    }
    

   
    
    
    
    
}
