package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resultSum = 0;
        int[] arrayNumber = new int[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
        //doy la orden de ingresar número. "printf" es para ingresar números, y %d para sustituirlo.
            System.out.printf ("Ingrese el valor para la posición %d en el arreglo", i);
            arrayNumber [i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            resultSum += arrayNumber[i]; // es igual a resultSum= resultSum + arrayNumber[i];

        }
        System.out.printf("La suma de los elementos del arreglo es %d ", resultSum);


        }

    }

