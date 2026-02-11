/* Leia um número e mostre sua tabuada (1 a 10)
     */
import java.util.Scanner;
	public class Exercicio9{
		public static void main(String[]args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número para ver sua tabuada: ");
		int numero = scanner.nextInt();
		System.out.println("A sua tabuada é " + numero + ":");
		for (int i = 1; i <= 10; i++){
		int resultado = numero * i;
		System.out.println( numero + "X" + i + "=" + resultado);
		}
	}
}