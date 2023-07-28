package Java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prática02 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            List<objetivosMine> mine = new ArrayList<objetivosMine>();
            int opção;
            console.nextLine();
            do {
                System.out.println("O que deseja fazer?");
                System.out.println("1- Adicionar objetivo");
                System.out.println("2- Remover objetivo");
                System.out.println("3- Concluir objetivo");
                System.out.println("4- Atualizar o objetivo");
                System.out.println("5- Listar objetivos");
                System.out.println("9- Encerrar o programa");
                opção = console.nextInt();
                int opx;
                switch (opção) {
                    case 1:
                        String objetivo;
                        System.out.println("Insira o objetivo a ser adicionado: ");
                        objetivo = console.nextLine();
                        mine.add(new objetivosMine(objetivo));
                        break;
                    case 2:
                        for (objetivosMine P : mine) {
                            System.out.println("---------------------");
                            P.imprimeObjetivos();
                            System.out.println("---------------------");
                        }
                        System.out.println("Qual objetivo deseja excluir?");
                        opx = console.nextInt();
                        opx = opx + 10;
                        break;
                    case 3:
                        for (objetivosMine P : mine) {
                            System.out.println("---------------------");
                            P.imprimeObjetivos();
                            System.out.println("---------------------");
                        }
                        System.out.println("Qual objetivo deseja concluir?");
                        opx = console.nextInt();
                        System.out.println("Objetivo concluído");
                        break;
                    case 4:
                        break;
                    case 5:
                        for (objetivosMine P : mine) {
                            System.out.println("---------------------");
                            P.imprimeObjetivos();
                            System.out.println("---------------------");
                        }
                        break;
                    case 9:
                        break;
                    default:
                        break;
                }
                continue;
            } while (true);
        }
    }
}
