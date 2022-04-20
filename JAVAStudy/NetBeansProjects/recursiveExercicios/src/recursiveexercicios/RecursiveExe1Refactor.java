/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveexercicios;

/**
 *
 * @author Joao.Zacarias
 */
public class RecursiveExe1Refactor {

    /**
     * @param args the command line arguments
     */
   
      static void dec(int x){
       
         if(x > 0){
             if(x % 2 == 0){
              System.out.println(x);
             }
            dec(x-1);
         }
         else{
             System.out.println(0);
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        dec(10);
    }
    
}
