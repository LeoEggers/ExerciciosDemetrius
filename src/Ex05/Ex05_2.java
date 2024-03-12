package Ex05;

import java.util.Arrays;

public class Ex05_2 {
    public static void organizarString(String s){
        // Cria um array para armazenar os valores das letras
        int[] valores = new int[s.length()];

        // Preenche o array com os valores das letras
        for (int i = 0; i < s.length(); i++) {
            valores[i] = s.charAt(i) - 'a' + 1; // Calcula o valor da letra em relação ao alfabeto (a=1, b=2, ..., z=26)
        }

        // Ordena os valores
        Arrays.sort(valores);

        // Imprime o array original
        System.out.println("Array: " + Arrays.toString(valores));

        // Imprime o array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(valores));

        // Imprime a palavra na nova ordem
        System.out.print("Saída: ");
        for (int valor : valores) {
            // Converte o valor para o caractere correspondente
            char letra = (char) (valor + 'a' - 1); // Converte o valor para o caractere correspondente (a=97, b=98, ..., z=122)
            System.out.print(letra);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        organizarString("cabeça");
    }
}
