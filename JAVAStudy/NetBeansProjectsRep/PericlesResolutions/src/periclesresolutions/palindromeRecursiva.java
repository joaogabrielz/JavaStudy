/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package periclesresolutions;

/**
 *
 * @author Joao.Zacarias
 */
public class palindromeRecursiva{

	public static boolean palindrome(String str, int i, int j){
		
		if(i<j)
			if(str.charAt(i) != str.charAt(j))
				return false;
			else
				return palindrome(str,i+1,j-1);	
                
		else
			return true;
	}
	
	public static void main(String args[]){
	
		String str;	
		str = Input.readString("Palavra: ");
		
		if(palindrome(str,0,str.length()-1))
			System.out.println("Palindrome!");
		else
			System.out.println("NAO Palindrome!");
	}

}
