package tp7.ej1;

public class main {
    public static void main(String[] args) {
        Museo m = new Museo(5);
        Visitante[] v = new Visitante[20];
        ControlTemp ct = new ControlTemp(m, "");

        for (int i = 0; i < v.length - 5; i++) {
            v[i] = new Visitante(m, 'v', "Visitante ");
        }

        for (int i = v.length - 5; i < v.length; i++) {
            v[i] = new Visitante(m, 'j', "Jubilado ");
        }

        ct.start();
        for (int i = 0; i < v.length; i++) {
            v[i].start();
        }

    }

}