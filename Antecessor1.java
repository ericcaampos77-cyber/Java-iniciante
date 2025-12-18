
package antecessor1;

import java.util.Scanner;

/**
 *
 * @author eric-campos7
 */
public class Antecessor1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner (System.in);
        
        int numero = tec.nextInt();
        
        int  antecessor =  numero - 1;
        int sucessor = numero + 1;
        System.out.println("Antecessor: " + antecessor);
        System.out.print("Sucessor: " + sucessor);
        
        tec.close();
        
                
        
    }
    
}
