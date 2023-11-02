/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Tomas
 */
public class main6 {

    public static void main(String[] args) {
        Avion[] a = new Avion[4]; //despegue
        Avion[] a2 = new Avion[15]; //aterrizaje
        Pista p = new Pista(a.length, a2.length );
        TorreControl t = new TorreControl(p);

        for (int i = 0; i < a.length; i++) {
            a[i] = new Avion("Avion de despegue " + i, p, 'd');
        }

        for (int i = 0; i < a2.length; i++) {
            a2[i] = new Avion("Avion de aterrizaje " + i, p, 'a');
        }
        
        t.start();
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i].start();
        }
    }
}
