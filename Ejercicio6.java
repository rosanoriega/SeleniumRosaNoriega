package Ejercicios_Clase_4;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int [] ventas = new int [7];
        String [] días = new String [7];

        días[0]= "Domingo";
        días[1]= "Lunes";
        días[2]= "Martes";
        días[3]= "Miercoles";
        días[4]= "Jueves";
        días[5]= "Viernes";
        días[6]= "Sábado";

        for(int j=0; j<días.length; j++){
            System.out.println("Ingrese las ventas del día " + j);
            ventas[j]= input.nextInt();

        }

        for (int pos= 0;pos<ventas.length; pos++){
            System.out.println("Se vendio el dia " + días[pos] + " $ " + ventas[pos]);
        }

    }

}
