/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Tomas
 */
public class main4 {
    public static void main(String[] args){
        GestorImpresoras g = new GestorImpresoras(); 
        Thread c1 = new Cliente3(g,'A'); 
        c1.setName("Tomas");
        Thread c2 = new Cliente3(g,'A'); 
        c2.setName("Juan");
        Thread c3 = new Cliente3(g,'A'); 
        c3.setName("Oscar");
        Thread c4 = new Cliente3(g,'X'); 
        c4.setName("Mariana");
        Thread c5 = new Cliente3(g,'B'); 
        c5.setName("Esteban");
        Thread c6 = new Cliente3(g,'B'); 
        c6.setName("Lionel");
        Thread c7 = new Cliente3(g, 'B'); 
        c7.setName("Joaquin");
        Thread c8 = new Cliente3(g, 'X'); 
        c8.setName("Tangalanga");
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start(); 
        c7.start();
        c8.start();
    }
}
