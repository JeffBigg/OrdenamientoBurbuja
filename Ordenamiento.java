
package ordenamiento;

import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa 5 números al azar:");

        int[] numbers = new int[5];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        
    }
    
}
