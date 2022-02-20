package calculadora;

import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    double numero;




    public Calculadora() {

         //this.numero = numero;
    }
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    public int suma ( int num1 , int num2){
        return num1 + num2;
    }

    public void factorial (){
        double factorial = 1;


        System.out.println(" Ingrese un numero para saber su factorial: ");
        numero = sc.nextDouble();


        while (numero != 0) {
            factorial = factorial * numero;

            numero--;

        }
        System.out.println(" El factorial es: " + (factorial)  );



    }
    public void raiz (){

        System.out.println(" Ingrese el numero que desea saber su raiz: ");
        numero = sc.nextDouble();
        sc.nextLine();
       System.out.println("La raiz es: " + Math.sqrt(numero));

    }
    public void cubo (){

        System.out.println(" Ingrese el numero que desea saber su cubo: ");
        numero = sc.nextDouble();
        sc.nextLine();
        System.out.println("el cubo es: " + Math.pow(numero, 3));

    }
}
