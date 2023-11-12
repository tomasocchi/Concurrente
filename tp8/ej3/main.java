package tp8.ej3;

public class main {
    public static void main(String[] args) {
       Pasteleria2 p = new Pasteleria2(15); 
       Pastel[] pas = new Pastel[30];
       //ControlPasteleria cp = new ControlPasteleria(p); 
       Empaquetador e = new Empaquetador(p,"Empaquetador 1"); 
       Empaquetador e2 = new Empaquetador(p, "Empaquetador 2"); 
       Brazo b = new Brazo(p);  
       int it = 0; 
       int j = 0; 
       
       while(it < pas.length){
        switch(j){
            case 0: pas[it] = new Pastel('A', p);break; 
            case 1: pas[it] = new Pastel('B', p);break;
            case 2: pas[it] = new Pastel('C', p);break;
        }

        j++; 
        if(j == 2){
            j = 0; 
        }
        it++; 
       }
     

      // cp.start();
       e.start();
       e2.start();
       b.start();
       for (int i = 0; i < pas.length; i++) {
            pas[i].start();
       }

    }
}
