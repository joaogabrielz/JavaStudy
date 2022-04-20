/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividade;

/**
 *
 * @author Joao.Zacarias
 */
public class exempleRecrusiveFAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fat(5));
        
    }
    
    static int fat(int n){
        if(n > 0){
            return n * fat(n-1);
        }
        else{
            return 1;
        }
       
    }
}
