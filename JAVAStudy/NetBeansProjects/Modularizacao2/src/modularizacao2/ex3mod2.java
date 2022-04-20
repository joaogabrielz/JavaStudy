/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularizacao2;

import java.util.Scanner;

/**
 *
 * @author Joao.Zacarias
 */
public class ex3mod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
 
        int numConta[] = new int[3]; //OBS se mudar aqui tem qmudar qntd embaixo
     // vetor> numeros conta corrente
        Double matrizSaldoElimite[][] = new Double[3][2]; 
                                    //3linhas - 2 cols
     // matriz> Saldo s/ cheque especial -- limite do cheque especial
        
        cadastrar_contas(numConta, matrizSaldoElimite);
        relatorio_contas(numConta, matrizSaldoElimite);
        
//         menu(); 
//         System.out.println("Opcoes:");
//         int opcao = s.nextInt(); 
       
         Double value;
         Double dif;
         int conta;
         int opcao = 0;
         while(opcao != 3){
            opcao = menu();
            switch(opcao){
                case 1 -> {
                    System.out.println("Numero da conta: ");
                    conta = s.nextInt();
                    
                    System.out.println("Valor a ser Depositado: ");
                    value = s.nextDouble();
                    dif = deposito_conta(conta, value, numConta, matrizSaldoElimite);
                    System.out.println(dif);              
                }
                case 2 -> {
                    System.out.println("Numero da conta: ");
                    conta = s.nextInt();
                    
                    System.out.println("Valor a ser debitado: ");
                    value = s.nextDouble();
                    dif= debito_conta(conta, value, numConta, matrizSaldoElimite);
                    System.out.println(dif);
                }
                case 3 ->{
                    System.out.println("Saindo ...");
                    System.exit(opcao);
                }
                default -> {
                        System.out.println("[x]Opcao invalida--");
                      
                    }
            }
         }
       
    }
    
    static int menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("-----------MENU----------");
        System.out.println("1- Deposito em conta");
        System.out.println("2- Debito em conta");
        System.out.println("3- sair em conta"); 
        System.out.println("Opção: ");
        int val = s.nextInt();
        return val;
    }
    static void cadastrar_contas(int numCont[], Double matriz[][]){
        Scanner s = new Scanner(System.in);
        System.out.println("> Cadastramento de Correntistas--");
        System.out.print("Quantos?: ");
        int qnt = s.nextInt();
        
        for(int i =0; i < qnt; i++){
            System.out.println("> --[Add] Conta corrente " + (i +1)+ ": --");
            numCont[i] = s.nextInt();
                 
                for(int c=0; c< 1; c++){
                    System.out.println("> Saldo sem cheque especial conta-" + (i + 1)+ ": ");
                    matriz[i][0] = s.nextDouble();
                    System.out.println("> Limite do cheque especial conta-" + (i + 1)+ ": ");
                    matriz[i][1] = s.nextDouble();
                  }
             
        }
      
            
    }
    static void relatorio_contas(int numCont[], Double matriz[][]){
        System.out.println("> --Relatorio de contas--");
        for(int i =0; i < numCont.length ; i++){
                System.out.println("Conta " + (i + 1)+ ": ---");
                System.out.println("Conta corrente: " + numCont[i]); 
                  for(int c=0; c< 1; c++){
                        System.out.println("Saldo: ");
                        System.out.println(matriz[i][0]);
                        System.out.println("Limite: ");
                        System.out.println(matriz[i][1]);
                        System.out.println("----------------");
                      }             
                   }   
 
    }
    
    static double deposito_conta(int conta, double valor, int numCont[], Double matriz[][]){ 
        double valAnterior = valor;
        boolean ok = true;
        Scanner s = new Scanner(System.in);
        System.out.println("> Deposito em Conta --");    
        for(int i =0; i < numCont.length; i++){         
                for(int c=0; c< 1; c++){
                    if(numCont[i] == conta){
                         System.out.println("Conta ["+ numCont[i] + "] encontrada: " ); 
                        System.out.println(" Saldo anterior: " + matriz[i][0]);
                        System.out.println(" Adiconado > " + valor);
                         valor =  valor + matriz[i][0];
                          matriz[i][0] = valor; //adicionar a matriz tbm
                        System.out.println(" Saldo Atual Conta ["+ numCont[i]+ "]: ");
                        break;
                   } 
                    if(valor < valAnterior){
                        System.out.println("Conta Nao encontrada");
                        valor = -9999;
                        break;
                    }
                    else{
                        ok = false;
                    }
                }   
             }
        if(ok == false){ valor = -9999;}
     return valor;
    }
    static double debito_conta(int conta, double valor, int numCont[], Double matriz[][]){ 
        double valAnterior = valor;
        boolean ok = true;
        Scanner s = new Scanner(System.in);
        System.out.println("> Debito de Conta --");    
        for(int i =0; i < numCont.length; i++){         
                for(int c=0; c< 1; c++){
                    if(numCont[i] == conta){
                        if(valAnterior > matriz[i][0] && valAnterior > matriz[i][1]){
                            System.out.println("Saldo Insuficiente");
                            valor = -9998;   
                            break;
                        }
                        System.out.println("Conta ["+ numCont[i] + "] encontrada: " ); 
                        System.out.println(" Saldo anterior: " + matriz[i][0]);
                        System.out.println(" Debitado > " + valor);
                         valor = matriz[i][0] - valor ;
                          matriz[i][0] = valor; //debitar da matriz tbm
                        System.out.println(" Saldo Atual Conta ["+ numCont[i]+ "]: ");
                      
                   } 
                    
                    
                    if(valor < valAnterior){
                        System.out.println("Conta Nao encontrada");
                        valor = -9999;
                        break;
                    }
                     else{
                        ok = false;
                    }
                }   
             }
         if(ok == false){ valor = -9999;}
     return valor;
    }
}
