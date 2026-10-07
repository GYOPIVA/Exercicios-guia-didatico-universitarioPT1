package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        double conversao = numero;
        System.out.println("Numero int: " + numero);
        System.out.println("Numero double: " + conversao);
        sc.close();
    }
}
