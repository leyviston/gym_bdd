/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniquetec.gymbdd;

/**
 *
 * @author Vinicius
 */
import java.lang.System;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Cronometro {
    
    private long tempoPartida = -1;
    private long tempoParada = -1;
    private boolean decorrido = false;
    
    public void resetCronometro(){
        tempoPartida = -1;
        tempoParada = -1;
        decorrido = false;
    }  
    
    public Cronometro startCronometro(){
        tempoPartida = System.currentTimeMillis();
        decorrido = true;
        return this;
       
    }
    public Cronometro stopCronometro(){
       tempoParada = System.currentTimeMillis();
       decorrido = false;
       return this;
       
    }
    public long getTempoCronometro(){
        if(tempoPartida == -1)
            return 0;
        if(decorrido){
            return (System.currentTimeMillis() - tempoPartida);
        }else{
            return (tempoParada - tempoPartida);
        }
    }
}