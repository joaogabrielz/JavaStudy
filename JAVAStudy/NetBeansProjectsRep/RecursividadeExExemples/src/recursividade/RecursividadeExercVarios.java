/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividade;

/**
 *
 * @author Joao.Zacarias
 */
public class RecursividadeExercVarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercicio 1:-");
        System.out.println(x(4));
        
        System.out.println("Exercicio 2:-");
        System.out.println(Y(1.0, 10.0));
        
        System.out.println("Exercicio 3:-");
        System.out.println(Z(7));
        
        System.out.println("Exercicio 3:-");
        System.out.println(W(7,0));
        
    }
      public static int x(int n){
          if(n ==1 || n ==2)
              return n;
          return x(n-1) + n * x(n-2);
      }
    //return 14
     //3 + 3 * 1  6
    //2 + 4 * 1  7
      
      public static double Y(double x, double y){
          
          return (x >= y) ? (x + y)/2 : Y (Y (x+2, y-1) , Y(x+1, y-2));
      
      }
      public static double Z(int n){
          
          if(n == 1){
              return 1;
          }
          if(n % 2 == 0){
              return Z(n/2);
          }
          return Z((n-1)/2) + Z((n+1)/2);
      
      }
      public static double W(int n, int profund){
          int i;
          for(i=0; i < profund; i++){
              System.out.println("*");
          }
          System.out.println("W(" + n+", "+ profund + ")");
          if( n == 1){
              return 1;
          }
          if(n % 2 == 0){
              return W(n/2, profund+1);
          }
          return W((n-1)/2, profund+1) + W((n+1)/2, profund+1);
      
      }
      
}   
