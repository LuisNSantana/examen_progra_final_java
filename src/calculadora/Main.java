package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();
        Calculadora calc3 = new Calculadora();

        //calc1.factorial();
       //calc3.cubo();
       //calc2.raiz();
        System.out.println("---- MENU PRINCIPAL---- " + "\n" +"Segun el numero que desees se te hara la operacion" +"\n"+
                "1. Factorial" + "\n" + "2. Cubo" +"\n"+ "3. raiz" + "\n"  + "4. Salir"+"\n"+"Ingrese el numero: ");

        int i = entrada.nextInt();




        while (i >= 0) {
            entrada.nextLine();

            if (i == 1) {
                calc1.factorial();

            } else if (i == 2){
                calc2.cubo();
            }else if (i == 3){
                calc3.raiz();
            } else {
                System.out.println("HA FINALIZADO SU CALCULADORA");
            }
        }

    }

}
