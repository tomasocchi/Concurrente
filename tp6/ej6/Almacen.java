
package tp6.ej6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Almacen {
    private int cantProd;

    public Almacen() {
    }

    public synchronized void recargar() {
        cantProd++;        
        System.out.println("----Un productor agrega un producto al almacen, cantidad de productos " + cantProd + "----");
        this.notifyAll();
    }
    

    public synchronized void sacar() {
        try {
            while (cantProd == 0) {
                this.wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(tp6.ej4.Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }

        cantProd--;
        System.out.println("Un consumidor saca un producto, cantidad de productos " + cantProd);
        this.notifyAll();
    }
    

}
