package calculadora2;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    double numero;

    public void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("---- MENU PRINCIPAL---- " + "\n" +"Segun el numero que desees se te hara la operacion" +"\n"+
                "1. Factorial" + "\n" + "2. Cubo" +"\n"+ "3. raiz" + "\n"  + "4. Salir"+"\n"+"Ingrese el numero: ");


        int num = entrada.nextInt();

        while (num   >= 0) {
            entrada.nextLine();

            if (num == 1) {
                factorial();
            } else if (num  == 2){
                cubo();
            }else if (num == 3){
                raiz();
            } else {
                System.out.println("HA FINALIZADO SU CALCULADORA");
            }
        }
    }

    public void factorial(){
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

