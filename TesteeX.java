
package testeex;

import java.util.Scanner;

public class TesteeX {


    public static void main(String[] args) {
    
            Scanner tec = new Scanner (System.in);
            
            System.out.println("Digite um número: ");
            
            double n1 = tec.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            
            double n2 = tec.nextDouble();
         
            
            
            System.out.println("soma: " + (n1 + n2));
            System.out.println("subtração: " + (n1 - n2));
            System.out.println("multiplicação: " + (n1 * n2));
            
            //Cuidado com divisão por zero
            if (n2 != 0) {
                System.out.println("Divisão: " +(n1 / n2));
                
            } else {
                System.out.println("Divisão: não pode dividir por zero ");
            }
            tec.close();
        }

    private static double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }