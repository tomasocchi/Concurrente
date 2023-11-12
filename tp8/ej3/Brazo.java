package tp8.ej3;

public class Brazo extends Thread{
    private Pasteleria2 p; 

    public Brazo(Pasteleria2 pas){
        p = pas; 
    }

    public void run(){
        try {
            while(true){
               
                p.retirarCaja();
                System.out.println("EL BRAZO MECANICO ESTA RETIRANDO LA CAJA");
                Thread.sleep(1500);
                System.out.println("----------------------------------------");
                System.out.println("EL BRAZO MECANICO ESTA REPONIENDO UNA CAJA");
                Thread.sleep(1500);
                p.reponerCaja();
            }
        } catch (InterruptedException e) {}
    }

}
