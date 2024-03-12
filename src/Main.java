
import static Coletar.Coletar.*;
import static Ex01.Ex01.*;
import static Ex02.Ex02.*;
import static Ex03.Ex03.*;
import static Ex04.Ex04.*;
import static Ex05.Ex05_2.*;
import static Ex06.Aluno.*;

import Ex06.Aluno;

public class Main {
    public static void main(String[] args) {
        int escolha;

        do {
            escolha = coletarInt("""
                    Escolha a opção:
                    
                    1. Exercício 1;
                    2. Exercício 2;
                    3. Exercício 3;
                    4. Exercício 4;
                    5. Exercício 5;
                    6. Exercício 6;
                    7. Encerrar.
                    
                    """, 1, 7);

            switch (escolha) {

                case 1 -> {
                    do {
                        int num = coletarInt("Escolha um número inteiro positivo maior que 1: ", 2);
                        System.out.println(isPrimo(num) ?
                                "O número " + num + " é primo." :
                                "O número " + num + " não é primo.");
                        System.out.println("Lista de números primos entre 1 e " + num + ": ");
                        listarPrimos(num);
                    } while (continuar("\nDeseja continuar? (s/n): "));
                }


                case 2 -> {
                    do {
                        palpitar();
                    } while (continuar("\nJogar novamente? (s/n): "));
                }


                case 3 -> {
                    do {
                        String s = coletarString("Digite o nome: ");
                        mostrarIniciais(s);
                    } while (continuar("\nDeseja continuar? (s/n): "));
                }


                case 4 -> {
                    do {
                        String s = coletarString("Digite a frase: ");
                        inverterString(s);
                    } while (continuar("\nDeseja continuar? (s/n): "));
                }


                case 5 -> {
                    do {
                        String s = coletarString("Digite a String: ");
                        organizarString(s);
                    } while (continuar("\nDeseja continuar? (s/n): "));
                }


                case 6 -> {
                    do {
                        while (true) {
                            String nome = coletarString("Digite o nome do aluno (\"sair\" para encerrar): ");
                            if (!"sair".equalsIgnoreCase(nome)){
                                new Aluno(
                                        nome,
                                        coletarDouble("Digite a 1ª nota: ", 1, 10),
                                        coletarDouble("Digite a 2ª nota: ", 1, 10),
                                        coletarDouble("Digite a 3ª nota: ", 1, 10));
                            } else {
                                System.out.println("Média da turma: " + calcularMediaDaTurma());
                                System.out.println(getAlunos());
                                imprimirNomesAprovados();
                                imprimirNomesReprovados();
                                break;
                            }
                        }
                    } while (continuar("\nDeseja continuar? (s/n): "));
                }
            }
        } while (!(escolha ==7));

        fecharScanner();
        System.out.println("Encerrando... Volte sempre!");
    }
}