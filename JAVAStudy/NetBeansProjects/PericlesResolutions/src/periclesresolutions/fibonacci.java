/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package periclesresolutions;

/**
 *
 * @author Joao.Zacarias
 */

public class fibonacci {
    	
    public static int calculaFibonacci(int n){
        if(n==0 || n==1)
            return 1;
        else{
            int resp= calculaFibonacci(n-1)+calculaFibonacci(n-2);
            return resp;
        }
    }
    
    public static void main(String[] args) {
        int n= Input.readInt("Digite o valor n de Fibonacci que deseja calcular: ");
        int r;
        r = calculaFibonacci(n);
        System.out.println("Valor de Fibonacci para n="+n+" eh: "+r);
    }	
}
