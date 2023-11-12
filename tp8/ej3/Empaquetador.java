package tp8.ej3;

public class Empaquetador extends Thread {
    private Pasteleria2 p;
    private int pesoPastel;
    
    public Empaquetador(Pasteleria2 pas, String n) {
        p = pas;
        this.setName(n);
    }

    public void run() {
        try {
            while (true) {

                pesoPastel = p.tomarPastel();
                Thread.sleep(1500);
                p.verificarAccion(pesoPastel);
                Thread.sleep(500);
                p.ponerPastel(pesoPastel);

            }
        } catch (InterruptedException e) {}
    }
}
