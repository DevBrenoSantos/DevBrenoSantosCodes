package Testes.Teste01;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int tempo = 1, limite;
        System.out.println("Insira o tempo em segundos: ");
        limite = console.nextInt();
        for (int aux=0; aux<=(limite - 1); aux++) {
            System.out.println("Tempo: "+tempo+" segundos");
            tempo++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tempo Esgotado!");
    console.close();
    }
}