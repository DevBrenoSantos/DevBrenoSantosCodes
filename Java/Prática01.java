package Java;
import java.util.Scanner;
public class Prática01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double salario, salarioph, horas, parcial, INSS, sind, IR;
        System.out.print("Quanto ganha por hora? ");
        salarioph = console.nextDouble();
        System.out.println("Insira as horas mensais: ");
        horas = console.nextDouble();
        parcial = salarioph * horas;
        salario =((parcial * 0.11) + (parcial * 0.8) + (parcial * 0.5)) + parcial;
        IR = parcial * 0.11;
        INSS = parcial * 0.08;
        sind = parcial * 0.05;
        System.out.println("-----------------------------------");
        System.out.println("Salário Bruto: R$"+salario);
        System.out.println("Imposto de renda: R$"+IR);
        System.out.println("INSS: R$"+INSS);
        System.out.println("Sindicato: R$"+sind);
        System.out.println("Salário liquido: "+salario);
        System.out.println("-----------------------------------");
    console.close();    
    }
}