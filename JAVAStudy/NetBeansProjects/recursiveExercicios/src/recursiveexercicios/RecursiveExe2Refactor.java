/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveexercicios;

import java.util.Scanner;

/**
 *
 * @author Joao.Zacarias
 */
public class RecursiveExe2Refactor {

    /**
     * @param args the command line arguments
     */
    public static boolean pali(String p){
    
    return checkpali(p, 0, p.length()-1);
    }
    public static boolean checkpali(String p, int i, int f){
      if( i >= f){
          return true;
      }
      else{
          boolean it = p.charAt(i) == p.charAt(f);
          return it && (f - i == 1 ? true : checkpali(p, i +1, f-1));
      }
         
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
      //  String p = "arara";
        System.out.print("Digite uma palavra: ");
        String p = s.next();
      //  pali(p);
        if(pali(p) == true){
            System.out.println("É palindromo!");
        }
        else{
         System.out.println("Nao é palindromo!");
        }
       
    }
    
}
