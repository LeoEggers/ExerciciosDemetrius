/*6º Escreva um código que tenha uma classe chamada Ex06.Aluno,
     que receba três notas do tipo inteiro e o nome do aluno do tipo String.
     Pergunte ao usuário o nome do aluno e as três notas, continue pedindo alunos e notas
     até que o usuário digite “sair” como nome do aluno.
     Quando o usuário digitar “sair”, imprima a nota e média das notas de todos os alunos.
     Imprimir a média geral da turma.
     Imprimir a quantidade de alunos reprovados e aprovado (média >= 6 aprovado).
     Imprimir os nomes dos alunos aprovados
     Imprimir os nomes dos alunos reprovados
 */

package Ex06;

// Fiz esta classe para estudar streams e outras propriedades de objetos,
// Reaproveitei ela para o exercício.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Aluno {

    private static final List<Aluno> alunos = new ArrayList<>();
    private final String nome;
    private final double media;
    private final boolean aprovado;

    public Aluno(String nome, double... notas) {
        this.nome = nome;
        List<Double> listaNotas = new ArrayList<>();
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
            }
            listaNotas.add(nota);
        }
        this.media = calcularMedia(listaNotas);
        this.aprovado = this.media >= 6;
        alunos.add(this);
    }

    public Aluno() {
        // gera um aluno com uma média aleatória.
        alunos.add(this);
        this.nome = "a" + alunos.size();
        Random rd = new Random();
        this.media = (double) Math.round(rd.nextDouble() * 100) / 10;
        this.aprovado = media >= 7;
    }

    private double calcularMedia(List<Double> notas) {

        double somaNotas = notas.stream().reduce(Double::sum).orElse(0.0);
        return somaNotas / notas.size();
    }

    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        String mediaFormatada = String.format("%.2f", media);
        return "{" +
                "nome='" + nome + '\'' +
                ", média=" + mediaFormatada +
                ", aprovado=" + aprovado + "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.media, media) == 0 && aprovado == aluno.aprovado && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, media, aprovado);
    }

    public static double calcularMediaDaTurma() {
        double somaDasMedias = alunos.stream()
                .mapToDouble(Aluno::getMedia)
                .sum();
        return somaDasMedias / alunos.size();
    }

    private boolean isAprovado() {
        return this.aprovado;
    }

    public static void imprimirNomesAprovados() {
        System.out.println("Alunos aprovados:");
        alunos.stream()
                .filter(Aluno::isAprovado)
                .map(Aluno::getNome)
                .forEach(nome -> System.out.println("-" + nome));
    }

    public static void imprimirNomesReprovados() {
        System.out.println("Alunos reprovados:");
        alunos.stream()
                .filter(aluno -> !aluno.isAprovado())
                .map(Aluno::getNome)
                .forEach(nome -> System.out.println("-" + nome));
    }
}
