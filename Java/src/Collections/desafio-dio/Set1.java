import java.util.*;

public class Set1 {
    public static void main(String[] args) throws Exception {
    
        /*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
    
        Set<String> cores = new HashSet<>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");

        System.out.println("Cores do arco-íris:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("\nQuantidade de cores: " + cores.size());

        List<String> coresOrdenadas = new ArrayList<>(cores);
        Collections.sort(coresOrdenadas);
        System.out.println("\nCores em ordem alfabética:");
        for (String cor : coresOrdenadas) {
            System.out.println(cor);
        }

        List<String> coresInversas = new ArrayList<>(cores);
        Collections.reverse(coresInversas);
        System.out.println("\nCores na ordem inversa:");
        for (String cor : coresInversas) {
            System.out.println(cor);
        }

        System.out.println("\nCores que começam com 'v':");
        for (String cor : cores) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (!cor.startsWith("v")) {
                iterator.remove();
            }
        }

        System.out.println("\nCores após remoção:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        cores.clear();
        System.out.println("\nConjunto limpo. Está vazio? " + cores.isEmpty());

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}
