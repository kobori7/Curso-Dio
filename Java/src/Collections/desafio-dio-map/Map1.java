import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.*;
/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;*/

public class Map1{

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato1> agenda = new HashMap<>() {{
        put(1, new Contato1("Simba", 5555));
        put(4, new Contato1("Cami", 1111));
        put(3, new Contato1("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato1> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato1> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato1("Simba", 5555));
            put(4, new Contato1("Cami", 1111));
            put(3, new Contato1("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato1> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato1> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato1> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato1>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato1> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato1>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato1> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato1>> {
    @Override
    public int compare(Map.Entry<Integer, Contato1> cont1, Map.Entry<Integer, Contato1> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato1>> {
    @Override
    public int compare(Map.Entry<Integer, Contato1> cont1, Map.Entry<Integer, Contato1> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
} 