package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Ferry {
    private int espacios;
    private int espaciosActuales;
    private int espaciosDesocupados;
    private int cantAyPActuales;
    private boolean viajeRealizado = false;

    public Ferry(int espacioTotal, int cantAutos, int cantPasajeros) {
        espacios = espacioTotal;
        cantAyPActuales = cantAutos + cantPasajeros;
    }

    // Metodos utilizados por hilos Auto y Pasajero
    public synchronized void subirse(){
        try {
            while (espaciosActuales == espacios) {
                   this.wait();
            }
        } catch (InterruptedException e) {           
             Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, e);
            }
        
        espaciosActuales++;
        cantAyPActuales--;
        System.out.println("El " + Thread.currentThread().getName()
                + " se acaba de subir al Ferry, cantidad de espacios usados: " + espaciosActuales);

        if (espaciosActuales < espacios && cantAyPActuales == 0) {
            espaciosActuales = espacios;
        }

        this.notifyAll();
    }

    public synchronized void bajarse() {
        try {
            while (!viajeRealizado) {
                this.wait();
            }
        } catch (InterruptedException e) {
            Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, e);

        }

        System.out.println("El " + Thread.currentThread().getName()
                + " se acaba de bajar del Ferry");
        
                espaciosDesocupados++;
                this.notifyAll();
    }



//Metodos realizados por el control
    public synchronized void empezarViaje(){
        try {
            while (espaciosActuales < espacios) {
                this.wait(); 
            }
        } catch (Exception e) {
             Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, e);
         }
       
        System.out.println("--- EL VIAJE DEL FERRY ESTA POR COMENZAR ---");
    }

    public synchronized void terminarViaje(){
        System.out.println("--- EL VIAJE EN FERRY ACABA DE TERMINAR ---");
        viajeRealizado = true; 
        this.notifyAll();
    }

    public synchronized void permitirAcceso(){
        try {
            while(espaciosDesocupados < espacios){
                this.wait();
            }
        } catch (InterruptedException e) {
            Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, e);
         }
        
        System.out.println("--- EL CONTROL PERMITE EL ACCESO AL FERRY ---");
        espaciosDesocupados = 0; 
        espaciosActuales = 0; 
        viajeRealizado = false; 
        this.notifyAll(); 
    }

}
