package Ejercicios_Clase_4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int [] ventas = new int[7];

        for (int i=0; i<ventas.length; i++){
            System.out.println("Ingrese las ventas del día " + i);
            ventas[i] = input.nextInt();

        }

    }
}
