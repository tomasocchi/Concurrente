package tp6.ej7;

public class main {
    public static void main(String[] args) {
        Pasajero[] p = new Pasajero[6];
        Auto[] a = new Auto[6];
        Ferry f = new Ferry(5, a.length, p.length);
        ControlFerry cf = new ControlFerry(f);

        for (int i = 0; i < a.length; i++) {
            a[i] = new Auto(f, "Auto n°" + i);
            p[i] = new Pasajero(f, "Pasajero n°" + i);
        }

        cf.start();

        for (int i = 0; i < p.length; i++) {
            p[i].start();
            a[i].start();

        }

    }
}