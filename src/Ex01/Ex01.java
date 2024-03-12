package Ex01;

// 1º Escrever um código que receba um número inteiro e informe se ele é um número primo.

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static Boolean isPrimo(int num) {

        int cont = 0;
        boolean primo;

        // Divide o número escolhido por todos os números menores que ele e maiores que 1.
        // Se algum resultado der resto 0, o número não é primo.
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }

        return primo = cont == 0;
    }

    // Gera um stream dos números primos entre 1 e o número escolhido.
    public static void listarPrimos(int num){
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (isPrimo(i)){
                primos.add(i);
            }
        }
        primos.forEach(n -> System.out.print(n + ", "));
        System.out.print("\b\b");
    }
}
