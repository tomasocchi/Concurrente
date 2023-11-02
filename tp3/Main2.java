/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Main2 {

    public static void main(String[] args){
        
        Sistema sis = new Sistema(); 
         
        SolicitudArea s1= new SolicitudArea("Area 1", 1, 3, sis); 
        s1.setName("Hilo 1");
        SolicitudArea s2= new SolicitudArea("Area 2", 4, 2, sis);
        s2.setName("Hilo 2");
        SolicitudArea s3= new SolicitudArea("Area 3", 5, 1, sis);
        s3.setName("Hilo 3");
        SolicitudArea s4= new SolicitudArea("Area 1", 1, 1, sis); 
        s4.setName("Hilo 4");
        SolicitudArea s5= new SolicitudArea("Area 2", 4, 1, sis); 
        s5.setName("Hilo 5");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();

        
    }
}
