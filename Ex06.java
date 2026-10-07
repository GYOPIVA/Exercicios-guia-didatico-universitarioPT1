package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex06 {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[2];
        System.out.println("Digite um numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Digite outro numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Resultado: " + numeros[0] + numeros[1]);
        System.out.println("Resultado: " + (numeros[0] + numeros[1]));

    }
}
