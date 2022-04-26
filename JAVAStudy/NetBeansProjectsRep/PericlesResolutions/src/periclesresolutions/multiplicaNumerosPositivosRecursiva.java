/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package periclesresolutions;

/**
 *
 * @author Joao.Zacarias
 */
public class multiplicaNumerosPositivosRecursiva{

	public static int multiplica(int x,int y){
		
		if(x>0 && y>0)
			return x + multiplica(x,y-1);
		else
			return 0;
	}
	public static void main(String args[]){
	
		int x,y;
		
		x= Input.readInt("X: ");
		y= Input.readInt("Y: ");
		System.out.println("Res= "+multiplica(x,y));
	
	}



}
