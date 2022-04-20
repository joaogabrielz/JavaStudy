
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author zacar
 */
public class main1Mlehor {

    
    /**
     * @param args the command line arguments
     */
   public static void main (String[] args){
//   
//      System.out.println(tempCalcC(38));
//      System.out.println(String.format("%.2f", tempCalcF(100)));
//      System.out.println(String.format("%.2f", Volum(2, 4)));
//      System.out.println(String.format("%.2f", Combustivel(5,80,12)));
//      System.out.println(String.format("%.2f", Prestacao(800,5,10)));
//      System.out.println(Potencial(2, 5));
//      double[] v1 = {5,5,10};
//      MediaCalc(v1);

     Calculadora();
     
//      int[] v2 = {0,1,2,3,4,5,6,7,8,9};
//      invertVet(v2);
//     
//      System.out.println("---------------");
//      
//      for(int i =0 ; i <= 1 ; i++){
//           
//            Alunos aluno  = new Alunos();
//            aluno.solicitaNota();      
//            
//      } 
            
           // List<Alunos> a = new ArrayList<>();
          //  a.add(aluno);
           // System.out.println(a);    
           
//      }     
   }
   
   
   static void invertVet(int[] vet){
        
       System.out.print("Em ordem:  ");
       for(int i=0; i < vet.length ; i++){
          System.out.print(vet[i] + ",");
       }
       System.out.println("Invertido:  ");
       for(int i= vet.length - 1; i >= 0 ; i--){
          System.out.print(vet[i] + ",");
       }
   }
   
   public static void Calculadora(){
       
    JOptionPane.showInputDialog(
                   "Escolha Sua Opcao \n" +
                   "1- entrada \n" + 
                   "2- AdiÃ§Ã£o \n" + 
                   "3- SubtraÃ§Ã£o \n" +
                   "4- MultriplicaÃ§Ã£o \n" + 
                   "5- DivisÃ£o" +
                   "6- DivisÃ£o"  +
                   "Qual opcao deseja: ");
    Scanner s = new Scanner(System.in);
    int opt = s.nextInt();
   
    while(opt != 6){
        double n1 =0;
        double n2 =0;
        int operacao = s.nextInt();         
        switch(operacao){
   
            case 1:
                   n1 = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o valor 1: "));
                     n2 = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o valor 1: "));
                  
                  
                break;
           case 2 :  
              System.out.println("Soma = "+ Add(n1,n2));
              break;
             case 3 :  
              System.out.println("SubtraÃ§Ã£o = "+ Sub(n1, n2));
              break;

              case 4 :   
              System.out.println("MultiplicaÃ§Ã£o = "+ Mut(n1, n2));
              break;
               case 5 : 
              System.out.println("DivisÃ£o = "+ Div(n1, n2));
              break;
               default : System.out.println("OpÃ§Ã£o invalida - Fim"); 
               break;
                }
          }
   
    }
   
   
    public static double Add(double v1, double v2){
          
        return v1+ v2;
    }
    public static double Sub(double v1, double v2){
          
        return v1- v2;
    }
     public static double Mut(double v1, double v2){
          
        return v1 * v2;
    }
      public static double Div(double v1, double v2){
        double resp = 0;
        if(v1 != 0.0){
         resp =  v1 / v2;   
        }
        else{
          System.out.println("Denominador Nulo - Erro");
        }
        return resp;
    }
    
    
   
   static double tempCalcC(double c){
   //recebe em c mas sobrepoe transforma celsius to fahrenheit
   c = (9.0 * c + 160) / 5;
   return c;
   }
    
   static double tempCalcF(double f){
   //recebe em f mas sobrepoe e transforma fahrenheit to celsius

   f = (f - 32.0) * (5.0/9.0);
   return f;
   }
   
  static double Volum(double r, double alt){
  double volume = 3.14159;
  r = Math.pow(r, 2);
  return volume * r * alt;
  }
  
  static double Combustivel(double temp, double velM, double kms){
  double dist = temp * velM;
  
  //litros usados/consumo abaixo:
  return dist / kms;
  }
  
  static double Prestacao(double valor, double taxa, double tempo){
  
  return (valor + (valor * (taxa /100) * tempo));
  }
  
  static int Potencial(int base, int exp){
      int resp = 1;
      
      if(base > 0 && exp == 0){
          return 1;
      }
      else if(base == 0 && exp >= 1){
          return 0;
      }
      else{
          for(int i = 1; i<= exp; i++){
              resp = resp * base;
          
          }
          return resp;
      }
  }
  
  static void MediaCalc(double[] vet){
  double media = 0;
    
   for(int i=0; i< vet.length ;i++ ){
       media += vet[i]; 
   }
   System.out.println(String.format("%.2f", media = media / vet.length));
   
  }
  
}
