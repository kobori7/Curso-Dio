import java.util.Scanner;

public class Exercicio17 {

/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares. */

public static void main(String [] args) throws Exception{
Scanner scan = new Scanner(System.in);

int quantNumeros;

System.out.println("Qual a quantidade de números: ");
quantNumeros = scan.nextInt();
int quantPares = 0;
int quantImpares = 0;
int count = 0;
int numero = 0;
do{
System.out.println("Número :");
numero = scan.nextInt();

if(numero % 2 == 0) quantPares ++;
else quantImpares ++;

count = count + 1;

} while(count < quantNumeros);

System.out.println("Quantidade de números pares: " + quantPares);
System.out.println("Quantidade de números impares: " + quantImpares);

}
}   
