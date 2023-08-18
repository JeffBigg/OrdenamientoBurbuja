
package ordenamiento;

import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa 5 números al azar:");

        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Has ingresado los siguientes números:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
    }
    
}
