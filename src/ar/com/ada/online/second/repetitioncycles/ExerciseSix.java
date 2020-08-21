package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4]; //cuando es un array de dos dimensiones. [filas] [columnas]
        int zeroCounter = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese el valor de la matriz en la posición %d , %d ", i, j);
                matriz[i][j] = keyboard.nextInt();
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0)
                    zeroCounter = zeroCounter + 1;
            }
        }
        System.out.printf("La cantidad de ceros en la matriz es de: %d ", zeroCounter);


    }
}
