

package tp6.ej7;


public class main {

    public static void main(String[] args) {
        //Use misma longitud, pero se puede usar distintas para cada objeto
        Autito[] a = new Autito[6];
        Pasajero[] p = new Pasajero[6];
        Ferry f = new Ferry(5, a.length, p.length);
        ControlFerry cf = new ControlFerry(f);

        for (int i = 0; i < a.length; i++) {
            a[i] = new Autito(f, "Auto n°" + i);
            p[i] = new Pasajero(f, "Pasajero n°" + i);
        }

        cf.start();
        for (int i = 0; i < a.length; i++) {
            a[i].start();
            p[i].start();
        }
    }
}
