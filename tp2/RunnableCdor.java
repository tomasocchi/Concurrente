/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Tomas
 */
public class RunnableCdor implements Runnable{
    
Dato unContador;  

public RunnableCdor (Dato elCdor){

unContador = elCdor;

}


public void run() {

for (int x=0; x<10000; ++x)

unContador.contar();

}

}

