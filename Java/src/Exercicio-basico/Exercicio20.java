import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        int reais = sc.nextInt();

        int doces = reais * 2;

        System.out.println("Você recebeu " + doces + " doces!");

        sc.close();
    }
}
/*teste da dio */