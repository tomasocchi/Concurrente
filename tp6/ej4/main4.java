package tp6.ej4;

public class main4 {

    public static void main(String[] args) {
        Almacen a = new Almacen(7);
        Productor[] p = new Productor[15];
        Consumidor[] c = new Consumidor[15];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Productor(a);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = new Consumidor(a);

        }

        for (int i = 0; i < c.length; i++) {
            c[i].start();
            p[i].start();
        }

    }
}
