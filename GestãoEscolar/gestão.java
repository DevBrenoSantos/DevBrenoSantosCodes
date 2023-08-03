package GestãoEscolar;
import java.util.Scanner;
/* Variáveis globais */
public class gestão {
    public static String nome, regist_acad, regist_curso;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        do {
        System.out.println("Insira o Nome do aluno: ");
        nome = console.nextLine();
        System.out.println("Insira o RA: ");
        regist_acad = console.nextLine();
        System.out.println("Insira o oregistro do curso: ");
        regist_curso = console.nextLine();
        if (regist_acad.equalsIgnoreCase("00000") || nome.equalsIgnoreCase("x")) {
            System.out.println("Fim do programa.");
            break;
        } else {
            System.out.println(nome+" - "+regist_acad);
        }
    } while (true);
    console.close();    
    }
}
