package SumaArrays2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] MatrizA = {3 ,1 ,2 ,0 ,5 , -3 , 7 ,0 ,4};
        int [] MatrizB = {-1, 2, 4 , 2,5,8,0,1,-2};

        int [] sumaMatrices ={MatrizA[0] + MatrizB[0], MatrizA[1] + MatrizB[1], MatrizA[2] + MatrizB[2],
        MatrizA[3] + MatrizB[3], MatrizA[4] + MatrizB [4], + MatrizA[5] + MatrizB[5], MatrizA[6] + MatrizB[6],
        MatrizA[7], MatrizB[7], MatrizA[8] + MatrizB[8]};

        System.out.println(Arrays.toString(sumaMatrices));
    }
}
