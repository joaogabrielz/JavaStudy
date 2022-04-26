
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joao.Zacarias
 */
//TESTE COM OBJETOS NAO CONCLUIDO COM SUCESSO
    
    public class Alunos{
       
       private String nome;
       private Double media;
       private Double p1;
       private Double p2;
       private Double nextra;
   
       
    public Alunos(){}   
       
    public Alunos(String nome,Double media, Double p1, Double p2, Double nextra){
          
         this.nome = nome;
         this.p1 = p1;
         this.p2 = p2;
         this.nextra = nextra;
         this.media = media;
      
      }

    

    
      public void solicitaNota(){
          System.out.println("Digite nome aluno: ");
          Scanner scan = new Scanner(System.in);
          this.nome = scan.nextLine();
          //System.out.println(nome);
          
          System.out.println("Nota p1: ");
          this.p1 = scan.nextDouble();
          
          System.out.println("Nota p2: ");
          this.p2 = scan.nextDouble();
          
          System.out.println("Nota extras: ");
          this.nextra = scan.nextDouble();
          
          //System.out.println(calcMedia(this.p1, this.p2, this.nextra));
          calcMedia(this.nome, this.p1, this.p2, this.nextra);
      }
      public void calcMedia(String name, Double n1, Double n2, Double extras){
         
      Double media;
      if(n1 != 10 && n2 != 10){
          if(n1 + n2 >= 10){
              for(int i = 0; ((n1 + n2) / 2) + extras >= 10; i++){
                extras--;
              }
          }
        media = ((n1 + n2) / 2) + extras; 
      }
      else{
      media = ((n1 + n2) / 2);
      }
      
        exibeAluno(name,media,n1,n2,extras);
      }
      public void exibeAluno(String nome, Double media,Double nota1, Double nota2, Double extra){
      
          System.out.println("------------------------");
          System.out.println("Aluno: " + nome);
          System.out.println("Nota p1: " + nota1);
          System.out.println("Nota p2 " + nota2);
          System.out.println("Pontos extras " + extra);
          System.out.println("------------------------");
          System.out.println("Media total: " + media);
          
          finishProg();
      
      }
      
      public int finishProg(){
          System.out.println("");
          System.out.println("quitting ...");
      return 0;
      }
      
   }