/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license -default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Sistema {

    private Area a = new Area();

    public synchronized void realizarReserva(String a, int pos, int cant) {
        switch (a) {
            case "Area 1":
                reservarEspaciosA1(a, pos, cant);
                break;
            case "Area 2":
                reservarEspaciosA2(a, pos, cant);
                break;
            case "Area 3":
                reservarEspaciosA3(a, pos, cant);
                break;
        }
    }

    private void reservarEspaciosA1(String a, int pos, int cant) {
        System.out.println("El hilo " + Thread.currentThread().getName() + " quiere reservar espacios");
        this.a.area1(cant, pos);
        System.out.println("El hilo " + Thread.currentThread().getName() + " terminó de usar el sistema");
    }

    private void reservarEspaciosA2(String a, int pos, int cant) {
        System.out.println("El hilo " + Thread.currentThread().getName() + " quiere reservar espacios");
            this.a.area2(cant, pos);
         System.out.println("El hilo " + Thread.currentThread().getName() + " terminó de usar el sistema");

    }

    private void reservarEspaciosA3(String a, int pos, int cant) {
        System.out.println("El hilo " + Thread.currentThread().getName() + " quiere reservar espacios");
        this.a.area3(cant, pos);
        System.out.println("El hilo " + Thread.currentThread().getName() + " terminó de usar el sistema");

    }
    

}
