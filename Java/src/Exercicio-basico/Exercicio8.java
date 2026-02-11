/*Calcule a soma dos números de 1 a 100.*/
import java.util.Scanner;
	public class Exercicio8{
		public static void main(String[]args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		for (int i = 1; i <= 100; i++){
		soma += i;
}

		System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}
}
