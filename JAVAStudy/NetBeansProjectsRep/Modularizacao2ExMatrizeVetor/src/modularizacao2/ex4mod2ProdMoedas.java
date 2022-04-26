/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularizacao2;

import java.util.Scanner;

/**
 *
 * @author zacar
 */
public class ex4mod2ProdMoedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String prods[] = new String[7];
        int prodPrec[] = new int[7]; 
        int opt;

       do{
       opt = menu(prods, prodPrec);
       introMoed(prodPrec, opt);
       }while(opt != 0);
    }
   
    static int menu(String prod[],int prodPrec[]){
        Scanner s = new Scanner(System.in);
        System.out.println("------MENU------");
        addProd(prod, prodPrec);
        ListProd(prod, prodPrec);
        System.out.println("- press [0] para SAIR -");
        System.out.print("Escolha Produto com numero: ");
      
        int opt = s.nextInt();
        return opt;
    }
    static void introMoed(int prodPrec[], int numdigt){
        Scanner s = new Scanner(System.in);
        int moed[] = new int[prodPrec.length];
         
        System.out.println("Produto sel. Valor: "+ prodPrec[numdigt -1]);
         System.out.println("Introduza moedas que perfaça montante.. -"); 
          System.out.print("Moeda: ");
           moed[0] = s.nextInt();
            System.out.println("---------------------"); 
             if(moed[0] == prodPrec[numdigt -1]){  
                      System.out.println("Valor moeda: " + moed[0]);
                      System.out.println("Valor Porduto: " + prodPrec[numdigt -1]); 
                      System.out.println("[ok]Produto adquirido..");
             }
             else{
                while(moed[0] > prodPrec[numdigt -1] || moed[0] < prodPrec[numdigt -1]){  
                     System.out.println("Valor moeda: "+ moed[0]);
                         if(moed[0] > prodPrec[numdigt - 1]){
                            System.out.println("> Valor acima digite decremento: ");
              //              System.out.println("Valor moeda atual: "+ moed[0]);
                            moed[0] = moed[0] - s.nextInt();  
                         }             
//                  if(moed[0] < prodPrec[numdigt -1]){
                        else{
                            System.out.println("> Valor abaixo digite incremento: ");  
                         //   System.out.println("Valor moeda atual: "+ moed[0]);
                            moed[0] = moed[0] + s.nextInt();  
                         }          
                       }
             }
             if(moed[0] == prodPrec[numdigt -1]){  
                  System.out.println("Valor moeda atual: " + moed[0]);
                  System.out.println("Valor Porduto: " + prodPrec[numdigt -1]); 
                  System.out.println("[ok]Produto adquirido..");
              }
        }
    
    static void addProd(String prod[], int prodPrec[]){
     //   Scanner s = new Scanner(System.in);
       // System.out.println("Adiciona produtos --");
//        for(int i =0; i < prod.length; i++){
//            System.out.print("produto "+ (i +1)+"*: ");
//            prod[i] = s.next();
//            System.out.print("preco: ");
//            prodPrec[i] = s.nextInt();
//        }
            prod[0] = "carne";
            prod[1] = "pao";
            prod[2] = "banana";
            prod[3] = "maça";
            prod[4] = "cenoura";
            prod[5] = "abacaxi";
            prod[6] = "limao";
            prodPrec[0] = 200;
            prodPrec[1] = 100;
            prodPrec[2] = 50;
            prodPrec[3] = 20;
            prodPrec[4] = 10;
            prodPrec[5] = 5;
            prodPrec[6] = 1;
       // System.out.println("-------------------");
    }
    static void ListProd(String prod[], int prodPrec[]){
        System.out.println(" Lista produtos  -----");
            for(int i =0; i < prod.length; i++){
            System.out.print("Produto "+ (i+1)+"* ["+ prod[i] +"]");
            System.out.println(" Preco: "+ prodPrec[i] +" escudos");
            }
        System.out.println("-------------------");
    
    }
}
