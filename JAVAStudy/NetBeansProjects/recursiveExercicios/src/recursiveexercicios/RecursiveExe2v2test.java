package recursiveexercicios;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joao.Zacarias
 */
public class RecursiveExe2v2test {

    /**
     * @param args the command line arguments
     */
     static String Palicheck(String p, String pInverso ){
         pInverso = new StringBuffer(p).reverse().toString();
         if(p.equals(pInverso)){
             return "Palindromo! ";
         }
         return "Nao palindromo";
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
       // String p = "arara";
      //  String p2 = "arara";
        String p;
        String p2;
        System.out.println("Conferir se é palindromo");
        System.out.print("Palavra: ");
        p = s.next();
        p2 = p;
        System.out.println(Palicheck(p, p2));
        
    }
    
}
