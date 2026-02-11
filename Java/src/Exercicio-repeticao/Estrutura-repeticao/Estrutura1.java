public class Estrutura1 {
    public static void main(String[] args) throws Exception {
    
        String M1 = "janeiro";
        String M2 = "fevereiro";
        String M3 = "março";
        String M4 = "abril";
        String M5 = "maio";
        String M6 = "junho";
        String M7 = "julho";
        String M8 = "agosto";
        String M9 = "setembro";
        String M10 = "outubro";
        String M11 = "novembro";
        String M12 = "dezembro";

        System.out.println("Mês 1: " + M1 + " férias");
        System.out.println("Mês 2: " + M2);
        System.out.println("Mês 3: " + M3);
        System.out.println("Mês 4: " + M4);
        System.out.println("Mês 5: " + M5);
        System.out.println("Mês 6: " + M6 + " férias");
        System.out.println("Mês 7: " + M7);
        System.out.println("Mês 8: " + M8);
        System.out.println("Mês 9: " + M9);
        System.out.println("Mês 10: " + M10);
        System.out.println("Mês 11: " + M11);
        System.out.println("Mês 12: " + M12 + " férias");

    if (M1 == "janeiro") {
        System.out.println("Férias em " + M1);
    }
    if (M6 == "junho") {
        System.out.println("Férias em " + M6);
    }
    if (M12 == "dezembro") {
        System.out.println("Férias em " + M12);
    }
    else {
        System.out.println("Não é mês de férias");

    }    
    }
}
