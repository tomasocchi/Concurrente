
package tp4;

/**
 *
 * @author Tomas
 */
public class prueba {
  public static void main(String[] args){
    int[] a = new int[3];
    int[] b = new int[2];
    int[] c = new int[5];

  
        for(int i = 0; i <3; i++){
            a[i] = i+2; 
            c[i] = a[i]; 
        }
         for(int i = 0; i <2; i++){
            b[i] = i+3; 
            c[c.length + (a.length + 1+ i)] = b[i]; 
        }
         
         for(int i=0; i < c.length; i++){
             System.out.println(c[i]);
         }
        
  }
    

        
    
}
