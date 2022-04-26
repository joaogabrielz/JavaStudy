
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joao.Zacarias
 */
public class ex5mod {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
         System.out.println("--------MENU-------- ");
        System.out.println("1-Cadastrar contato ");
        System.out.println("2-Pesquisa nome");
        System.out.println("3-Classifica contatos ");
        System.out.println("4-Apresenta contatos ");
        System.out.println("5-Sair progama ");
        System.out.print("Opcao deseja: ");
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
 
        String []nomes;
        String []enderecos;
        int []telefones;
        nomes = new String [10];
        enderecos = new String [10];
        telefones=new int [10];
        
        Scanner s = new Scanner(System.in);
        
        int opt;
        //int acoes;
        int qtd = 0;
        

            opt = 0;
        while(opt != 5){
            
            
            menu();
            opt = s.nextInt();
           
        
            switch(opt){
                case 1 -> {
                
                 System.out.print("Quantos usuarios?: ");
                 qtd = s.nextInt();
              //  s.close();
                  nomes = new String [qtd];
                  enderecos = new String [qtd];
                  telefones=new int [qtd];
                  
                 CadastraUsers(nomes, enderecos, telefones, qtd);
                }
            
                case 2 -> {
                
                 BuscaNomes(nomes, enderecos, telefones, qtd);
                
                
                }
                
                case 3 -> {
                
                ClassificaC(nomes, enderecos, telefones, qtd);
                
                }
                
                case 4 ->{
                    
                 ApresentaC(nomes, enderecos, telefones, qtd);
                    
                }
                case 5 -> {
                
                Sair();
                }
                default -> {
                    System.out.println("---------------------------"); 
                    System.out.println("Opcao invalida...voltando ao menu..");
                    
                }
                
            }
        
        }

    }
    public static void Sair(){
        System.out.println("Saindo....");
        System.exit(0);
    }
    
    public static void CadastraUsers(String nomes[], String enderecos[], int telefones[], int qtd){

        Scanner s = new Scanner(System.in);
        
       try{ 
            for(int i =0; i < qtd; i++){
                System.out.println("--------CADASTRO "+(i+1)+"---------");
                System.out.print("Nome usuario " + (i+1) + ": ");
                nomes[i] = s.next();
                System.out.print("endereco: ");
                enderecos[i] = s.next();
                System.out.print("telefone: ");
                telefones[i] = s.nextInt();

            }
            System.out.println("[:)]Cadastrado(s) com sucesso");
          // s.close();
           }
       catch(Exception e){
           System.out.println("[X] Ocorreu um erro la leitura");
       }
        
    }   
    
      public static void BuscaNomes(String nomes[], String enderecos[], int telefones[], int qtd){

        Scanner s = new Scanner(System.in);
        String buscaN;
        
       try{ 
          
           System.out.println("--------Busca---------");
           System.out.print("Qual Nome Deseja Buscar: ");
           buscaN = s.nextLine();
            
            for(int i =0; i < qtd; i++){
                if(buscaN == nomes[i]){      
                  System.out.println("Usuario nao encontrado...");
                }
                else{
                   System.out.println("----Usuario Encontrado---");
                   System.out.println("Usuario: " + nomes[i]);
                   System.out.println("Endereco: " + enderecos[i]);
                   System.out.println("Telefone: " + telefones[i]);
                   break;
                }

            }      
           //s.close();
           }
       catch(Exception e){
           System.out.println("[X] Ocorreu um erro la leitura");
       }
        
    }  
   
      public static void ClassificaC(String nomes[], String enderecos[], int telefones[], int qtd){

       try{ 
          
           System.out.println("----Contatos Classificados By name-----");
           
           Arrays.sort(nomes);
           Arrays.sort(enderecos);
           Arrays.sort(telefones);
           for(int i=0; i < qtd ; i++){
               System.out.println(i + "* ------------------: ");
               System.out.println(nomes[i]);
               System.out.println(enderecos[i]);
               System.out.println(telefones[i]);
           }
            
            
           
       }
       catch(Exception e){
           System.out.println("[X] Ocorreu um erro la leitura" + e.getMessage());
       }
   }
       
        public static void ApresentaC(String nomes[], String enderecos[], int telefones[], int qtd){

       try{ 
          
           System.out.println("----Apresenta Contatos-----");
           
           for(int i=0; i < qtd ; i++){
               System.out.println(i + "* ------------------: ");
               System.out.println(nomes[i]);
               System.out.println(enderecos[i]);
               System.out.println(telefones[i]);
           }
            
            
           
       }
       catch(Exception e){
           System.out.println("[X] Ocorreu um erro la leitura" + e.getMessage());
       }
        
    }  
}
