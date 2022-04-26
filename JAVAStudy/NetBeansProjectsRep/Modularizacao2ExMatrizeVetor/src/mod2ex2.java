
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joao.Zacarias
 */
public class mod2ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String tipoc;
        Double precoMax;
        String tip;
        
         restaurants paloza  = new restaurants();
        // restaurants luar = new restaurants();
         paloza.SolicitaDados(); 
        
   
         System.out.print("tipo de comida deseja: ");
         tipoc = scan.nextLine();
         System.out.print("preco maximo que deseja gastar: ");
         precoMax = scan.nextDouble();
         scan.close();
         
         
            
           
         
         
    }
    
}
