package tp8.ej3;

public class Pastel extends Thread {
    private Pasteleria2 p;
    private int peso;
    private char horno;
    private int[] pesosPasteles = new int[3];


    public Pastel(char h, Pasteleria2 pas) {
        horno = h;
        p = pas;
        pesosPasteles[0] = 3; 
        pesosPasteles[1] = 5; 
        pesosPasteles[2] = 6;  
    }

    public void run() {
        try {
            switch (horno) {
                case 'A':
                    p.ingresarMostrador();
                    Thread.sleep(100);
                    p.solicitarEntrarCaja(pesosPasteles[0]);
                    break;

                case 'B':
                    p.ingresarMostrador();
                    Thread.sleep(100);
                    p.solicitarEntrarCaja(pesosPasteles[1]);
                    break;
                case 'C':
                    p.ingresarMostrador();
                    Thread.sleep(100);
                    p.solicitarEntrarCaja(pesosPasteles[2]);
                    break;
            }
        } catch (InterruptedException e) { }
    }


    public int getPeso() {
        return peso;
    }

}
