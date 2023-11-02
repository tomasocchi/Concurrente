/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Tomas
 */
public class main7 {
    public static void main(String[] args){
        Confiteria c = new Confiteria();
        Mozo mozo = new Mozo(c); 
        Empleado[] emps = new Empleado[15]; 
        
        for(int i= 0; i <15; i++){
            emps[i] = new Empleado(c); 
        }
        mozo.start();
        for(int i= 0; i <15; i++){
            emps[i].start();
        }
    }
}
