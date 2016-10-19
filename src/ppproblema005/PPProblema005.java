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
        
        int n;
        do{
            System.out.println("Introduce un número");
            Scanner entrada= new Scanner(System.in);
            n=Integer.parseInt(entrada.nextLine());
            boolean primo=true;
            
            for(int i=2; i<n && primo==true; i++){
                if(n % 1==0) primo=false;
                
            }
            if(primo==true)
                System.out.println("El número" + n + "es primo");
            else
                System.out.println("El número" + n + "NO es primo");
        }while (n>0);
       
    }  
}

