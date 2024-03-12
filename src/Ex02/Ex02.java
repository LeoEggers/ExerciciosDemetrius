package Ex02;

/*2º Escrever um código que sorteie um número randômico de 0 a 1000,
     peça um número inteiro neste intervalo, se o usuário errar,
     informar se o valor sorteado é maior ou menor que o informado
     e solicitar outro número do usuário até que ele acerte o número.
     Quando acertar, informar a quantidade de palpites que ele informou até acertar.
 */

import Coletar.Coletar;
import java.util.Random;

public class Ex02 {

    public static void palpitar(){

        Random rd = new Random();
        int num_sorteado = rd.nextInt(1, 1001);
        int num_tentativas = 0;

        System.out.println("Escolha um número entre 1 e 1000 (0 para desistir): ");

        while (true) {
            int num_usuario = Coletar.coletarInt(
                    "Sua escolha: ", 0, 1000);
            num_tentativas ++;

            if (num_usuario==0){
                System.out.println("O número era " + num_sorteado + ".");
                System.out.println("Até a próxima!");
                break;
            }

            if (num_usuario != num_sorteado) {
                System.out.println(num_usuario > num_sorteado ?
                        "O número é menor que " + num_usuario :
                        "O número é maior que " + num_usuario);

                System.out.println("Tentativas: " + num_tentativas);

            } else {
                System.out.println("Parabéns! Você acertou o número!");
                System.out.println("Foram necessárias " + num_tentativas + " tentativas.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        palpitar();
    }
}
