package tp7.ej1;

public class Visitante extends Thread {
    private Museo museo;
    private char tipo;

    public Visitante(Museo m, char t, String nombre) {
        museo = m;
        tipo = t;
        this.setName(nombre);
    }

    public void run() {
        switch (tipo) {
            case 'v':
                try {
                    museo.entrarSala();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                museo.salirSala();

                break;

            case 'j':

                try {
                    museo.entrarSalaJubilado();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                museo.salirSala();

                break;
        }
    }
}
