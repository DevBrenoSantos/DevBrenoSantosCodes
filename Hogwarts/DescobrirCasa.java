package Hogwarts;
public class DescobrirCasa {
    public String DescobrirCasaH () {
        int opcao = 0;
        double casa;
        String nomeCasa = "";
        casa = Math.round((Math.random() * 100));
        if (casa <= 25) {
            opcao = 1;
        }
        if (casa > 25 && casa <= 50) {
            opcao = 2;
        }
        if (casa > 50 && casa <= 75) {
            opcao = 3;
        }
        if (casa > 75) {
            opcao = 4;
        }

        switch (opcao) {
            case 1: 
            nomeCasa = "Grifinória";
            break;
            case 2: 
            nomeCasa = "Sonserina";
            break;
            case 3: 
            nomeCasa = "Corvinal";
            break;
            case 4: 
            nomeCasa = "Lufa-Lufa";
            break;
            default: break;
        }
        return nomeCasa;
    }
}
