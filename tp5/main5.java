
package tp5;

/**
 *
 * @author Tomas
 */
public class main5 {
    public static void main(String[] args){
        Tren t = new Tren(); 
        VendedorTickets v = new VendedorTickets("Vendedor", t); 
        ControlTren ct = new ControlTren("Control Tren", t);
        Pasajero[] p = new Pasajero[12];
        
        for(int i=0; i<12; i++){
            p[i] = new Pasajero("Cliente "+i, t); 
            
        }
        
        v.start();
        ct.start();
        for(int i=0; i<12; i++){
            p[i].start(); 
            
        }
    }
}
