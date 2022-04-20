
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joao.Zacarias
 */
public class restaurants {
    
    private String nome;
    private String endereco;
    private Double precomedio;
    private String tipocomida;
    
    public restaurants(){}
    
    public String getTipoComida(){
        return this.tipocomida;
    }
    
   
    
  
    public restaurants(String nome, String endereco, Double precomedio, String tipocomida){
    
        this.nome = nome;
        this.endereco = endereco;
        this.precomedio = precomedio;
        this.tipocomida = tipocomida;
    
    }
    
    public void Initialize0(){
        this.endereco = null;
        this.nome = null;
        this.precomedio = 0.0;
        this.tipocomida = null;
    }
    
    public void InitializeFix(){
        this.endereco = "rua teste1";
        this.nome = "restauranteT";
        this.precomedio = 200.00;
        this.tipocomida = "japonesa";
    }
    
    public void SolicitaDados(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome Restaurante: ");
        this.nome = scan.nextLine();
        System.out.print("Endereco: ");
        this.endereco = scan.nextLine();
        System.out.print("Tipo de comida: ");
        this.tipocomida = scan.nextLine();
        System.out.print("Preco medio: ");
        this.precomedio = scan.nextDouble();
        System.out.println("----------------------- ");
        
    }
    
    public void ImprimeDados(){
        
        System.out.println("Imprimindo ...");
        System.out.println(this.nome);
        System.out.println(this.endereco);
        System.out.println(this.tipocomida);
        System.out.println(this.precomedio);
        
    }
    
    
    
}
