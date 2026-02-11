import java.util.Scanner;

public class Exercicio15 {
    
    /*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial");
        int fatorial = scan.nextInt();
        int resultado = 1;

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
        }

        System.out.println("Fatorial de " + fatorial + " é: " + resultado);
    }
}
