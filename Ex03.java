package GuiaBasicoJavaPT1;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a letra da turma: (A - Z)");
        char letra = sc.next().toUpperCase().charAt(0);
        System.out.println("Turma : " + letra);
        sc.close();
    }
}
