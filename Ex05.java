package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomeCompleto = new String[2];
        System.out.println("Digite seu nome: ");
        nomeCompleto[0] = sc.next();
        System.out.println("Digite seu sobrenome: ");
        nomeCompleto[1] = sc.next();

        System.out.printf("Seu nome completo é:\n" +
                "%S %S", nomeCompleto[0], nomeCompleto[1]);
    }
}
