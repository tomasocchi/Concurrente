
package tp5;

/**
 *
 * @author Tomas
 */
public class main2 {
    public static void main(String[] args){
        
        Confiteria confi = new Confiteria(); 
        Cocinero walter = new Cocinero(confi); 
        Mozo jesse = new Mozo(confi); 
        
        Empleado[] e = new Empleado[4]; 
        
       e[0] = new Empleado(confi, 'a'); 
       e[1] = new Empleado(confi, 'b'); 
       e[2] = new Empleado(confi, 'c'); 
       e[3] = new Empleado(confi, 'a'); 
        
       walter.start();
       jesse.start();
       for(int i =0; i<4; i++){
           e[i].start();
       }
    }
}
