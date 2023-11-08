package tp7.ej1;

import java.util.Random;

public class ControlTemp extends Thread {
    private Museo museo;
    private Random r = new Random();
    private int temp = 27;

    public ControlTemp(Museo m, String nombre) {
        museo = m;
        this.setName(nombre);
    }

    public void run() {

        while (true) {

            temp = temp + r.nextInt(5) + 1;
            museo.notificarTemperatura(temp);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

            temp = 27;
        }

    }

}
