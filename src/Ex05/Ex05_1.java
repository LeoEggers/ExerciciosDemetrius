package Ex05;/*5º Escreva um código que receba uma String simples (apenas uma palavra)
     e monte um array com os valores respectivos a cada letra da palavra,
     os organize em ordem crescente, imprima esse array e a palavra na nova ordem.
     Ex.:
     Entrada: estudar
     Array: {5, 19, 20, 21, 4, 1, 18}
     Array ordenado: {1, 4, 5, 18, 19, 20, 21}
     Saída: aderstu.
 */

import java.util.*;

// Este código tem problemas, não suporta caracteres especiais pela forma como o dicionário foi feito.

public class Ex05_1 {
    public static void organizarString(String s){

        // Gerando um dicionário:
        List<Character> letras = new ArrayList<>();
        for (char i = 'a'; i <= 'z' ; i++) {
            letras.add(i);
        }

        Map<Character, Integer> dicionario = new HashMap<>();
        int i = 1;
        for (char c: letras) {
            dicionario.put(c, i);
            i++;
        }

        // Mapeando a sequência:
        List<Integer> sequenciaNumerica = new ArrayList<>();

        String[] sequencia = s.split("");
        for (String c : sequencia) {
            char letra = c.charAt(0);
            sequenciaNumerica.add(dicionario.get(letra));
        }

        // String original:
        System.out.println("String: " + s);

        // Sequência numérica:
        System.out.println(sequenciaNumerica);

        // Ordenando a sequência numérica em ordem crescente:
        Collections.sort(sequenciaNumerica);
        System.out.println(sequenciaNumerica);

        // Gerando a string da sequência ordenada:
        for (Integer n : sequenciaNumerica) {
            for (Map.Entry<Character, Integer> entry : dicionario.entrySet()) {
                if (entry.getValue().equals(n)) {
                    System.out.print(entry.getKey());
                }
            }
        }
    }

    public static void main(String[] args) {
        organizarString("batata");
    }
}
