
package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número del rango: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo número del rango: ");
        int segundoNumero = scanner.nextInt();
        
        System.out.println("Los números impares en el rango de " + primerNumero + " a " + segundoNumero + " son:");
        for (int i = primerNumero; i <= segundoNumero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
   }    
        
   }
