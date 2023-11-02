/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Tomas
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;
// Constructor y métodos de acceso
    
    public Cliente(String n, int[] p){
        this.nombre = n; 
        carroCompra = p; 
    }
   
    public String getNombre(){
        return nombre; 
    }
    
    public int[] getCarroCompra(){
        return carroCompra; 
    }
}
