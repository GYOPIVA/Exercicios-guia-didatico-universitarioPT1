package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sistemaOnline = true;

        System.out.println("Ligar sistema? (S/N)");
        char letra = sc.next().toUpperCase().charAt(0);
        while (letra != 'S' && letra != 'N') {
            System.out.println("Ligar sistema? (S/N)");
            letra = sc.next().toUpperCase().charAt(0);
        }
        sistemaOnline =  letra == 'S' ? true : false;
        System.out.println("Sistema Online:" + sistemaOnline);
    }
}
