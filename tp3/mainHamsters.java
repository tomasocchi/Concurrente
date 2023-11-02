/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class mainHamsters {
    public static void main(String[] args){
        Jaula j = new Jaula(); 
        Thread h1 = new Thread(j, "Pity");
        Thread h2 = new Thread(j, "Messi");
        Thread h3 = new Thread(j, "Jorge");
        h1.start();
        h2.start();
        h3.start();
        }
}
