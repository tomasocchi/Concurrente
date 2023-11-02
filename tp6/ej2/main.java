/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.ej2;

/**
 *
 * @author Tomas
 */
public class main {
    public static void main(String[] args) {
        SalaEstudio s = new SalaEstudio(5); 
        Estudiante[] e = new Estudiante[40]; 
        
        for (int i = 0; i < e.length; i++) {
            e[i] = new Estudiante(s); 
        }
        
        for (int i = 0; i < e.length; i++) {
            e[i].start();
        }
    }
}
