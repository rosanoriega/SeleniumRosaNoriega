package Ejercicios_Clase_4;

import java.util.Scanner;

public class Ejercicio4_y_5 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int suma = 0;

        int [] ventas = new int[7];

        for (int i=0; i< ventas.length; i++){
            System.out.println("Ingrese las ventas del día " + i);
            ventas[i] = input.nextInt();
            suma = suma + ventas[i];

        }

        System.out.println("Las ventas de la semana fueron " + suma);

        System.out.println("El promedio de ventas de la semana fue " + suma / ventas.length);

    }

}
