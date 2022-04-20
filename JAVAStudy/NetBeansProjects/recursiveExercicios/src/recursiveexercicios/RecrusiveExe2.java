/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveexercicios;

import java.util.Arrays;

/**
 *
 * @author zacar
 */
public class RecrusiveExe2 {

    /**
     * @param args the command line arguments
     */
    
    static String InvertP(String p){
    
        String[] pSplited = p.split("");
        int aux = pSplited.length; //5   
        //aux = aux +1;
        String[] pInverted = new String[aux];
        
        int x= aux -1;
        for(int i=0; i < aux; i++){
            pInverted[i] = pSplited[x-i];    
            
        }
        System.out.println("Palavra invertida: ");
        for(int i=0; i < aux; i++){
            System.out.print(pInverted[i]);
        }
        System.out.println(" ");
        
        int c =0;
        int f = aux -1;
        
       String[] pInvSplit = pInverted;
       System.out.println("> Checando Palindromo:.. ");
       int cont = 0;
       PaliCheck(pInverted, pInvSplit, c, f, cont);
       return p;
    }
    
    static boolean PaliCheck(String Splited[], String pInvSplit[], int c, int f, int cont){
    boolean it = false;
  
     if(f <= -1){
         System.out.println(it);
                return it;
           }
       if(Splited[c].contains(pInvSplit[f])){
           cont++;
           if(cont > 1){
                it = true;
               System.out.println(it); 
                 return it;
           }
          
       }       
        return PaliCheck(Splited,pInvSplit,c+1,f-1,cont);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      //  String p[] = {"a","r","a","r","a
       // String p = "arara";
//        String[] pSplited = p.split("");
//        int aux = pSplited.length; //5   
//        for(int i =0; i < aux; i++){
//            System.out.println(pSplited[i]);
//        }
       String p = "abba";   
        System.out.println("Palavra: ");
        System.out.println(p);
       InvertP(p);
       
        
    }
    
}
