/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Tomas
 */
public class Cadena {

    private String cad;
    private String turno = "A";

    public Cadena() {
        cad = "";
    }

    public void creaCad(String letra, int cant) {
        for (int i = 0; i < cant; i++) {
            cad = cad + letra;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String a) {
        turno = a;
    }

    
    public boolean verificarCad(String letra) {
     return (turno == letra); 
    }
    
    
     public void cambiarTurno(String turno){
        switch(turno){
            case "A": setTurno("B");break; 
            case "B": setTurno("C");break; 
            case "C": setTurno("A");break; 
        } 
            
   }
     
     public String mostrarCad(){
         return cad; 
     }
}
