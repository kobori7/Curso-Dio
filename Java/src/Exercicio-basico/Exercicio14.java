import java.util.Scanner;


public class Exercicio14 {
    public static void main(String[] args) throws Exception {

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
    
Scanner scan = new Scanner(System.in);
int nota = 0;
while (true) {
    System.out.println("Informe uma nota entre 0 e 10: ");
    nota = scan.nextInt();
    if (nota < 0 || nota > 10) {
        System.out.println("Valor inválido! Tente novamente.");
    break;}

System.out.println("Nota válida: " + nota);
}
}
}