package sumaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementos;
        System.out.println("Ingrese el numero de elementos que desee para matriz A: ");
        elementos = sc.nextInt();

        int [] MatrizA = new int[elementos];

        System.out.println("Ingrese los datos de la matriz A: ");


        for (int i = 0; i <MatrizA.length; i++ ){
            System.out.println((i) + "Digite un elemento: ");


            MatrizA[i] = sc.nextInt();


        }


        System.out.println("\n");
        int elementosB;
        System.out.println("Ingrese el numero de elementos que desee para la matriz B: ");
        elementosB = sc.nextInt();

        int [] matrizB = new int[elementosB];

        for (int i = 0; i <=elementosB; i++){

            System.out.println((i) + "Digite un elemento: ");

            elementosB=-1;
            matrizB[i] = sc.nextInt();
        }
        System.out.println("\n");
        int sumaMatrices = MatrizA[elementos] + matrizB[elementosB];


        System.out.println((sumaMatrices));
    }
}
