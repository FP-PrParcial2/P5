/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema005;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce un Número");
        Scanner entradaEscanner = new Scanner(System.in);
         int n;
         n=entradaEscanner.nextInt(); 
          if((n % 1 == 0) && (n % n == 0) ){
            System.out.println("El número:"+ n +"ES Primo");  
       }else{
            System.out.println("El número:"+ n +"NO es Primo");
           }
    }
    
}
