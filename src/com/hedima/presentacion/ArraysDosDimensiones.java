package com.hedima.presentacion;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDosDimensiones {
    public static void main(String[] args) {
//        //Arrays de dos dimensiones
//        //1. Arrayss regulares todas las filas tienen el mismo número de columnas
//        int[][] numeros = new int[3][2];
//
//        numeros[0][0]= 5;
//        numeros[0][1]= 3;
//        numeros[1][0]= 10;
//        numeros[1][1]= 15;
//        numeros[2][0]= 12;
//        numeros[2][1]= 13;
//
//        System.out.println(Arrays.deepToString(numeros));
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Fila " + i);
//            for (int j = 0; j< numeros[i].length; j++) {
//                System.out.println("Elemento de la fila "+ i + " Columna "  +j + "->" +numeros[i][j]);
//            }
//
//        }

        //Declarar un array de 2x2
        //Dar valor a cada una de las celdas por la consola
//        Scanner scanner = new Scanner(System.in);
//        int[][] numeros = new int[2][2];
//
//        numeros[0][0] =
//        numeros[0][1] =
//        numeros[1][0] =
//        numeros[1][1] =
//
//        System.out.println(Arrays.deepToString(numeros));
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Da un valor a las filas");
//            scanner.nextInt();
//            for (int j = 0; j < numeros[i].length; j++) {
//                System.out.println("Da un valor a las columnas");
//                scanner.nextInt();
//                System.out.println("Los elementos de las filas son: " + i +"Los elementos de las columnas son" + j + numeros[i][j]);


        int numeros[][] = new int[2][2];

        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            for (int j=0; j<numeros[i].length; j++) {
                System.out.println("Introducir fila "+i+" columna     "+ j+" ");
                numeros[i][j] = s1.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numeros));

    }
}
