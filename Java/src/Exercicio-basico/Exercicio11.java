import java.util.*;


public class Exercicio11 {

    public static void main(String[] args) {
        
        /*  Crie uma ArrayList e adicione 5 nomes.
Depois imprima a lista.*/
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Eddie");
        nomes.add("Costela");
        nomes.add("Maggie");
        nomes.add("Pedro");
        nomes.add("Yurico");
        System.out.println(nomes);
    
        // Mostre quantos elementos existem usando //
        System.out.println("Quantidade de elementos: " + nomes.size());
        
        // Mostre apenas o terceiro nome da lista. //
        System.out.println("O terceiro nome da lista é: " + nomes.get(2));
        
        // Remova um nome da lista. //
        System.out.println("Removendo o primeiro nome da lista: " + nomes.remove(0));
        System.out.println(nomes);

        /*  Mostre todos os nomes usando:
✔ for tradicional
✔ for-each */
        System.out.println("Mostrando os nomes usando for tradicional:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("Mostrando os nomes usando for-each:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}   