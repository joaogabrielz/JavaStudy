/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividade;

/**
 *
 * @author Joao.Zacarias
 */
public class exempleRecursiveDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimeDec(5);
    }
    static void imprimeDec(int n){
        if(n >= 0){
            System.out.println(n);
            imprimeDec(n-1);
            System.out.println("!");
        }
    }
}
