/*Imprima apenas números pares de 1 a 20.*/
import java.util.Scanner;
	public class Exercicio6{
		public static void main(String[]args)throws Exception{
		
		Scanner scanner = new Scanner(System.in);
			for(int i = 1; i <= 20; i++){
			if (i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}