package com.uniquetec.gymbdd;

/**
 * Hello world!
 *
 */

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    
public static void main(String[] args) {
       
       ArrayList<Contato> contatos = new ArrayList<Contato>();
       
       
        for(int i= 0; i<10000; i++){
            contatos.add( new Contato(i,"VVS_TESTE"+i,"35566"+i));
            
        }
       
        //listaElementos(contatos);
        //listaElementosVVS(contatos);
       //listarIterator(contatos);
        //concatenaNomes(contatos);
       concatenaNomesVVS(contatos);
        
    }
    
    
    public static void listaElementosVVS(ArrayList<Contato> lista){
        
        Cronometro cronometro = new Cronometro().startCronometro();
       
        int tamanho = lista.size();
        for( int i = 0; i<tamanho; i++){
            System.out.println(lista.get(i).toString());
            System.out.println("");
            
        }
        System.out.println("Listar Melhorado: "+cronometro.getTempoCronometro()+" milisegundos.");

        
    }
    
        public static void listaElementos(ArrayList<Contato> lista){
        Cronometro cronometro = new Cronometro().startCronometro();

        for( int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i).toString()+"\n");
        }
        System.out.println("Listar Lento: "+cronometro.getTempoCronometro()+" milisegundos.");

        
    }
    
    public static void concatenaNomes(ArrayList<Contato> lista){
        
        Cronometro cronometro = new Cronometro().startCronometro();

        String todos_nomes = "";
        int tamanho = lista.size();
    
        for( int i = 0; i<tamanho; i++){
            
            todos_nomes = todos_nomes +"; "+lista.get(i).getNome();
           
            
      }
         System.out.println(todos_nomes);
         System.out.println("Concatenar String Lento: "+cronometro.getTempoCronometro()+" milisegundos.");

  }
    
        public static void concatenaNomesVVS(ArrayList<Contato> lista){
        
            Cronometro cronometro = new Cronometro().startCronometro();
        
            StringBuffer todos_nomes = new StringBuffer();
            int tamanho = lista.size();
    
            for( int i = 0; i<tamanho; i++){
            
                todos_nomes.append(lista.get(i).getNome());
                todos_nomes.append("; ");
           }
           System.out.println(todos_nomes);
           System.out.println("Concatenar String Melhorado: "+cronometro.getTempoCronometro()+" milisegundos.");

        }
    
 /*       
        public static void Excecao(){
            try {
            throw new Exception("An error occurred");
            } catch (Exception e) {}
           // 12.8 microseconds
            try {
            throw cachedException;
            } catch (Exception e) {}

         }
        
      */  
        public static void listarIterator(ArrayList<Contato> lista){
            
            Iterator<Contato> it = lista.iterator();
            
            while (it.hasNext()){
                
                 System.out.println(it.toString()+"\n");
           // it.next();
            }
            
            
        }
        
}