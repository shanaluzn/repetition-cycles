package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {

        int [] arrayA;
        int [] arrayB;
        int [] arrayC;
        int sizeArray;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de arreglo: ");
        sizeArray = keyboard.nextInt();

        arrayA = new int[sizeArray];
        arrayB = new int[sizeArray];
        arrayC = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Ingrese el valor para el arreglo A en la posición " + i + ":" );
            arrayA[i] = keyboard.nextInt();

            System.out.println("Ingrese el valor para el arreglo B en la posición " + i + ":" );
            arrayB[i] = keyboard.nextInt();

        }

        for (int i = 0; i < sizeArray; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("El resultad de la suma de los elementos de los arreglos A y B es: ");

        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("índice: %d, valor: %d\n", i, arrayC[i]);
        }

    }
}
