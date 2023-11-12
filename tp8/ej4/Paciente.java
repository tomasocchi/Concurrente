package tp8.ej4;

import java.util.Random;

public class Paciente extends Thread{
private Salita sala; 
private int numeroEspera, tiempoMaximo; 
private boolean silla = false, revista = false; 
private Random tAleatorio = new Random(); 

public Paciente(Salita s, int n, String st){
    sala = s; 
    numeroEspera = n; 
    this.setName(st);
}

public void run(){
    try {
        sala.ingresar(numeroEspera, revista, silla);
        
        tiempoMaximo = tAleatorio.nextInt(3000)+2000; 
        Thread.sleep(tiempoMaximo);

        sala.salirSala();
    } catch (InterruptedException e) {
    }
}

}
