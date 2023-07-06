package Hogwarts;
import java.util.Scanner;
public class Casa {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String juramento, casaH, encerramento;
        System.out.println("--------------------");
        juramento = console.nextLine();
        if (juramento.equalsIgnoreCase("Eu juro solenemente não fazer nada de bom")) {
            System.out.println("Bem vindo a Hogwarts, aqui descobriremos sua casa em Hogwarts!");
            DescobrirCasa casa = new DescobrirCasa();
            casaH = casa.DescobrirCasaH();
            
            if (casaH.equalsIgnoreCase("Grifinória")) {
                System.out.println("Chapéu seletor: ");
                System.out.println("    _Huuum, bravo cavalheiro. Sua casa é Grifinória!");
            }
            
            if (casaH.equalsIgnoreCase("Sonserina")) {
                System.out.println("Chapéu seletor: ");
                System.out.println("    _Nossa, que pessoa ambiciosa! Sua casa é Sonseria!");
            }
                
            if (casaH.equalsIgnoreCase("Corvinal")) {
                System.out.println("Chapéu seletor: ");
                System.out.println("    _Quanta inteligência e sabedoria, porém insensível. Sua casa é Corvinal!");
            }

            if (casaH.equalsIgnoreCase("Lufa-Lufa")) {
                System.out.println("Chapéu seletor: ");
                System.out.println("    _Paciência é uma virtudade, assim como sua dedicação. Sua casa é Lufa-Lufa!");
            }
    System.out.println("Encerre o programa ou o Lupin irá confiscar o mapa!");
    encerramento = console.nextLine();
    if (encerramento.equalsIgnoreCase("Malfeito feito"));
            System.out.println("Obrigado, agora o mapa será guardado e poderá usar novamente. ");
     }    
    console.close(); 
    }
}
