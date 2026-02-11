import java.util.Scanner;
    
    public class Exercicio10 {
    
        public static void main(String[] args) {
            
            /*Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).    */
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int prod = a * b;
            System.out.println("PROD = " + prod);
        }

}