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
public class RecursiveExe4FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    static int fibo(int n){
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
      return fibo(n-2) + fibo(n-1);

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("------Fibonacci Sequence-----");
        System.out.print("Deseja até qual numero maximo: ");
        int maxN = s.nextInt();
        System.out.print("Fibonacci de "+ maxN + " numeros: ");
        for(int i=0; i < maxN; i++){
            System.out.print(fibo(i)+ " ");
        }
        System.out.println(" ");
    }
    
}
