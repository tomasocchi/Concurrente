package tp6.ej6;

public class main {

    public static void main(String[] args) {
        Almacen a = new Almacen();
        Productor[] p = new Productor[100];
        Consumidor[] c = new Consumidor[35];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Productor(a);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = new Consumidor(a);

        }

        for (int i = 0; i < c.length; i++) {
            c[i].start();
        }

        for (int i = 0; i < p.length; i++) {
            p[i].start();

        }
   

    }
}
