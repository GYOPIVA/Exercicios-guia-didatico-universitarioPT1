package GuiaBasicoJavaPT1;

import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do curso");
        String nomeCurso = sc.nextLine();


        System.out.printf("Curso: %s\n" +
                "Caminho C:\\java\\Projetos\\\n" +
                "Bom dia!",nomeCurso);
        sc.close();
    }
}
