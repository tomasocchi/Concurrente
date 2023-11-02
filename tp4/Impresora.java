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
public class Impresora {
    
    char tipo; 
    Semaphore mutex = new Semaphore(1);
    Semaphore imp = new Semaphore(1);
    boolean uso = true;

    public Impresora(char t){
        tipo = t; 
    }
    public boolean usarImp(int i) throws InterruptedException {

        boolean exito = false;
        mutex.acquire();
        
        if (uso) {
            imprimir(i);
            exito = true;
        } else {
            mutex.release();
        }

        return exito;
    }

    public boolean solicitarUso() {
        return uso;
    }

    private void imprimir(int i) throws InterruptedException {
        uso = false;
        mutex.release();
        System.out.println("El cliente " + Thread.currentThread().getName() + " esta utilizando la impresora " + i +" de tipo "+tipo);
        Thread.sleep(100);
        System.out.println("El cliente " + Thread.currentThread().getName() + " terminó de usar la impresora " + i+ " de tipo "+tipo);
        uso = true;
    }
}
