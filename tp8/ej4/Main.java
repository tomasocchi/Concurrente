package tp8.ej4;


public class Main {
    public static void main(String[] args) {
        Salita s = new Salita();
        Paciente[] p = new Paciente[15]; 
        for (int i = 0; i < p.length; i++) {
            p[i] = new Paciente(s, i, "Paciente "+(i+1)); 
        }

        for (int i = 0; i < p.length; i++) {
            p[i].start();
        }
    }
}