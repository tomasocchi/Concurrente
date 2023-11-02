/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Area {

    private int[] espaciosArea1 = new int[9];
    private int[] espaciosArea2 = new int[9];
    private int[] espaciosArea3 = new int[9];

    public Area() {
    }

    public void area1(int cantPersonas, int posicion) {
        if (espaciosArea1.length > posicion) {
            if (espaciosArea1[posicion] == 1) {
                System.out.println("No se pudo realizar la reserva");

            } else {
                espaciosArea1[posicion] = 1;                
                System.out.println("Se reservó el espacio con exito");

            }
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }

    public void area2(int cantPersonas, int posicion) {
        if (espaciosArea2.length > posicion) {
            if (espaciosArea2[posicion] == 1) {
                System.out.println("No se pudo realizar la reserva");

            } else {
                espaciosArea2[posicion] = 1;
                System.out.println("Se reservó el espacio con exito");
            }
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }

    public void area3(int cantPersonas, int posicion) {
        if (espaciosArea3.length > posicion) {
            if (espaciosArea3[posicion] == 1) {
                System.out.println("No se pudo realizar la reserva");

            } else {
                espaciosArea3[posicion] = 1;
                System.out.println("Se reservó el espacio con exito");

            }
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }
}
