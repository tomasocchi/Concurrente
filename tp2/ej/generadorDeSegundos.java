/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ej;

/**
 *
 * @author Tomas
 */
public class generadorDeSegundos {

    public static void generarSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000); // Convertir segundos a milisegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // Aquí puedes realizar cualquier acción que desees después de esperar la cantidad de segundos.
        System.out.println("Se han generado " + segundos + " segundos.");
    }

    public static void main(String[] args) {
        int segundosAGenerar = 5; // Cambia este valor según tus necesidades
        generarSegundos(segundosAGenerar);
    }

}
