package Ex03;

/*3º Escreva um código que receba um nome completo em forma de String e mostre as iniciais do nome.
     Ex.:
     Entrada: Demetrius de Castro do Amaral
     Saída: D.C.A
 */

import java.util.Arrays;

public class Ex03 {

    public static void mostrarIniciais(String nome){
        String[] lista_nome = nome.toUpperCase().split(" ");
        // o regex funciona pq o método coletar string não permite mais de um espaço.

        String[] nomes_invalidos = {"DO", "DA", "DOS", "DAS", "DE"};

        for (String n : lista_nome) {
            if (!Arrays.asList(nomes_invalidos).contains(n)) {
                System.out.print(n.charAt(0) + ". ");
            }
        }
    }

    public static void main(String[] args) {
        mostrarIniciais("Demetrius de Castro do Amaral");
    }
}
