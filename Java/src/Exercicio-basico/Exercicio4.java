/*Imprima os números de 1 a 10 usando do-while. */
import java.util.Scanner;
	public class Exercicio4{
		public static void main(String[]args)throws Exception{
			Scanner scanner = new Scanner(System.in);
			int i = 1;
				do {
					System.out.println(i);
					i++;
				}while (i <=10);
	}
}