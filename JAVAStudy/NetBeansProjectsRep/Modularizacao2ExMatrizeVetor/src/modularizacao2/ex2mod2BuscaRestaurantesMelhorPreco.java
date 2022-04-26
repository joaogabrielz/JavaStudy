/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularizacao2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joao.Zacarias
 */
public class ex2mod2BuscaRestaurantesMelhorPreco {

     static void initialize0 (String na[], String en[], Double prec[], String tip[]){
        na[0] = null;
        en[0] = null;
        prec[0] = null;
        tip[0] = null;
    
    }
    static void initializeValu (String na[], String en[], Double prec[], String tip[]){
        na[0] = "moder";
        en[0] = "26 de agosto";
        prec[0] = 60.00;
        tip[0] = "sushi";
    
    }
    static void solicitaVal(String na[], String en[], Double prec[], String tip[]){
        
         Scanner s = new Scanner(System.in);
        int qntd;
        System.out.println("-----Adiciona Restaurante------");
        System.out.print("Quantos? : ");
        qntd = s.nextInt();
        
        
        for(int i =0; i < qntd; i++){
            System.out.println(" > Restaurante *" + (i + 1) + "---");
             System.out.print("Nome: ");
             na[i] = s.next();
             System.out.print("Endereco: ");
             en[i] = s.next();
             System.out.print("preco Medio: ");
             prec[i] = s.nextDouble();
             System.out.print("tipo Comida: ");
             tip[i] = s.next();
            System.out.println("-------------------");
        }
    }
    
    static void imprimeVal(String na[], String en[], Double prec[], String tip[], String tipe, Double preco){
         
        System.out.println("-----Imprime Restaurantes------");
          for(int i=0; i < en.length; i++){
                if(tipe.equals(tip[i]) && preco >= prec[i]){
                    System.out.println(" > Restaurante Encontrado com esse Valor: ");
                    System.out.println("Nome: " + na[i]);
                    System.out.println("Endereco: " + en[i]);
                    System.out.println("preco Medio: " + prec[i]);
                    System.out.println("tipo Comida: " + tip[i]);
                    System.out.println(" ---------------------------");
                }
        }           
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner s = new Scanner(System.in);
      int qnt = 5;
      String nome[] = new String[qnt];
      String endereco[] = new String[qnt];
      Double precoMedio[] = new Double[qnt];
      String tipoComida[] = new String[qnt];
 
      initialize0(nome, endereco, precoMedio, tipoComida);
      initializeValu(nome, endereco, precoMedio, tipoComida);
      
      solicitaVal(nome, endereco, precoMedio, tipoComida);

        System.out.println("> Deseja Qual tipo de Restaurante: ");
            System.out.print("Tipo comida: ");
            String tiper = s.next();
            System.out.print("Preco Max: ");
            Double precor = s.nextDouble();
        
        imprimeVal(nome, endereco, precoMedio, tipoComida, tiper, precor);
        
    }
        
}
     
