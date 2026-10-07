package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        System.out.println("Numero digitado: " + numero);
        System.out.println("Convertendo...");
        int conversao = (int) numero;
        System.out.println("Numero double Digitado: " + numero);
        System.out.println("Numero int convertido: " + conversao);
        sc.close();
    }
}
