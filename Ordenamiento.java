
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
            System.out.print(num + " - ");
        }
        System.out.println("-------------------------");
        ordenar(numbers);
        System.out.println("Números ordenados en forma ascendente:");
        for (int num : numbers) {
            System.out.print(num + " - ");
        }

    }
    public static void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
