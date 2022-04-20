/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularizacao2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao.Zacarias
 */
public class Modularizacao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int ncol, nlin;
//        Scanner scan = new Scanner(System.in);
        
        try{
                CriaMatriz(2, 2);
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a leitura");

      
        }

        
    }
        public static void CriaMatriz(int nlin, int ncol){
            
            Scanner scan = new Scanner(System.in);
            int p[][];          
//            System.out.print("quantas linhas: ");
//            nlin = scan.nextInt();
//            System.out.print("quantas colunas: ");
//            ncol = scan.nextInt();
            p = new int[nlin][ncol];
            
            for(int i=0;i < nlin ; i++){
             for(int j=0; j < ncol ; j++){       
                 System.out.print("Elemento [" +(i)+","+(j)+ "]: ");
                 p[i][j] = scan.nextInt();
            }}
            int tot[] = new int [5];
            scan.close();
            
            ImprimeMatriz(nlin,ncol, p);
            somaQuad(nlin, ncol, p, tot);
            SomaSegLin(nlin, ncol, p, tot);
            SomaDiag(nlin, ncol, p, tot);
            SomaTds(nlin, ncol, p, tot);
            SomaImpar(nlin, ncol, p, tot);
            
        }    
        
        public static void ImprimeMatriz(int lin, int col,int p[][]){
            
            System.out.println("[] MATRIZ IMPRESSA: ");
            for(int i=0;i < lin ; i++){
             for(int j=0; j < col ; j++){       
                  System.out.print(p[i][j] +" ");
            }
             System.out.println(" ");
            }
            
        }
        public static void somaQuad(int lin, int col, int p[][], int tot[]){

   
            System.out.println("[]soma Quadrado elementos da 1 coluna: ");
            for(int i =0; i < lin; i++){
                for(int j=0; j < col; j++){
                    if (j == 0){
                      tot[0] = tot[0] + (p[i][0] * p[i][0]);
                    }
                }
            }
            System.out.println(tot[0]);
        }
        
        public static void SomaSegLin(int lin, int col, int p[][], int tot[]){

          
            System.out.println("[]soma elementos da segunda linha ");
            for(int i =0; i < lin; i++){
                for(int j=0; j < col; j++){
                    if (i == 1){
                      tot[1] = tot[1] + p[1][j];
                    }
                }
            }
            System.out.println(tot[1]);
        }
        
         public static void SomaDiag(int lin, int col, int p[][], int tot[]){

          
            System.out.println("[]soma Diagonal principal ");
            String resp = "";
            for(int i =0; i < lin; i++){
                for(int j=0; j < col; j++){
                    if (lin == col){
                        if(i ==j){
                         tot[2] = tot[2] + p[i][i];
                         resp = Integer.toString(tot[2]);
                        }
                    }
                    else{
                        resp = "[ERRO] - Matriz nao quadrada";
                    }
                }
            }
            System.out.println(resp);
        }
        
         public static void SomaTds(int lin, int col, int p[][], int tot[]){

          
            System.out.println("[]Soma todos elementos da matriz ");
            for(int i =0; i < lin; i++){
                for(int j=0; j < col; j++){

                         tot[3] = tot[3] + p[i][j];

                }
            }
            System.out.println(tot[3]);
        }
         
          public static void SomaImpar(int lin, int col, int p[][], int tot[]){

          
            System.out.println("[]Soma elementos indice impar 2 linha ");
            for(int i =0; i < lin; i++){
                for(int j=0; j < col; j++){
                    if(i == 1 && j % 2 == 0){
                        tot[4] = tot[4] + p[1][j];
                    }                        
                }
            }
            System.out.println(tot[4]);
            RespTotVet(tot);
        }
          
          public static void  RespTotVet(int tot[]){

          
            System.out.println("[]Resposta Reporduzida por vetor no metodo: ");
            for(int i =0; i < tot.length; i++){
              System.out.println("RESPOSTA: " + (i + 1) + ": " + tot[4]);
            }           
        }
          
}
