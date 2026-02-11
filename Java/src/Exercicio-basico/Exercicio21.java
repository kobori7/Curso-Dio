import java.util.Scanner;
public class Exercicio21 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int velocidadeAtual = sc.nextInt();
        int velocidadePermitida = 60;

        if(velocidadeAtual > velocidadePermitida){
            System.out.println("Multado");
        } else {
            System.out.println("Não foi multado");
        }
    }
}
/* teste da dio */