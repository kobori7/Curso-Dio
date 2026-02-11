import java.util.Scanner;

public class Exercicio1{

public static void main (String[] args) throws Exception{

Scanner scanner = new Scanner(System.in);
System.out.println("Digite um número: ");
float numero = scanner.nextFloat();

if (numero > 0 ) {
System.out.println("Este número é postivo!" );
} else if (numero < 0) {
System.out.println("Este número é negativo!" );
} else {
System.out.println("Este número é zero!" );
}

scanner.close();

    }
}


/* Verifique se um número é positivo, negativo ou zero. */

