package tp6.ej2;

public class SalaEstudio {

    private int mesas;
    private int mesasEnUso;

    public SalaEstudio(int cantMesas) {
        mesas = cantMesas;
    }

    public synchronized void sentarse() {

        try {

            while (mesasEnUso == mesas) {
                this.wait();
            }
        } catch (InterruptedException ex) { }

        mesasEnUso++;
        System.out.println("---El "+Thread.currentThread().getName()+" se acaba de sentar, cantidad de mesas ocupadas: "+mesasEnUso+"---");
        this.notifyAll();
    }
    
    
    public synchronized void irse() throws InterruptedException{       
     try{
         while(mesasEnUso <0){
             this.wait();
         }
     }catch(InterruptedException e){
         
     }
     
     mesasEnUso--; 
     System.out.println("El "+Thread.currentThread().getName()+" ya terminó de estudiar, cantidad de mesas disponibles: "+mesasEnUso);
     this.notifyAll();
    }
    
}
