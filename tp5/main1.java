/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Tomas
 */
public class main1 {

    public static void main(String[] args) {
        Piscina p = new Piscina();
        GestorPiscina gestor = new GestorPiscina(p);
        Persona[] pers = new Persona[15];
        for (int i = 0; i < 15; i++) {
            pers[i] = new Persona(p);
        }
        gestor.start();
        for (int i = 0; i < 15; i++) {
            pers[i].start();
        }
    }
}
