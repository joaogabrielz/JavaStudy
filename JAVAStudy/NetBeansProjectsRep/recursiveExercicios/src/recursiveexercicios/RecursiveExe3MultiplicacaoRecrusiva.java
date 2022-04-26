/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveexercicios;

import java.util.Scanner;

/**
 *
 * @author zacar
 */
public class RecursiveExe3MultiplicacaoRecrusiva {

    /**
     * @param args the command line arguments
     */
//    
//    static int mul(int n1, int n2, int cont, int resp){
//    
//        if(cont > n1)
//            return resp;
//        
//    return  mul(n1,n2, cont+1, resp = resp + n2);
//    }
    static int mul(int n1, int n2, int cont, int resp){
    
        if(cont == n1)
            return resp;
        
    return  mul(n1,n2, cont+1, resp = resp + n2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s = new Scanner(System.in);
       int n1,n2;
        System.out.print("Digite numero 1: ");
        n1 = s.nextInt();
        System.out.print("Digite numero 2: ");
        n2 = s.nextInt();
        System.out.print("Multiplicação: "+n1 + " x "+ n2+ " = ");
        System.out.print(mul(n1,n2, 0, 0));
        System.out.println(" ");
        
        
    }
    
}
