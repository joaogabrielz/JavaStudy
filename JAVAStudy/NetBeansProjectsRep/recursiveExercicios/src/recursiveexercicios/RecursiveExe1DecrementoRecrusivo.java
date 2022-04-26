/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveexercicios;

/**
 *
 * @author zacar
 */
public class RecursiveExe1DecrementoRecrusivo {

    /**
     * @param args the command line arguments
     */
//    static int dec(int x){
//        if(x >= 0){
//            if(x % 2 == 0){
//              //  System.out.println(x);   
//                return x;
//            }
//        }
//       return dec(x-1);     
//    }
//     static int dec(int x){
//        if(x >= 1 && x % 2 == 0){
//            System.out.println(x);   
//        }
//         if(x < 0){
//             return 0;
//            }
//  
//       return dec(x-1);
//    }
     
     static int dec(int x){
       
         if(x == 0)
             return x;
         if(x % 2 == 0)
            System.out.println(x);
         
       return dec(x-1);
    }
     
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
//        System.out.println(dec(5));
        System.out.println(dec(10));
            
       
    }
    
}
