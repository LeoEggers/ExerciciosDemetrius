package Coletar;

import java.util.Scanner;

public class Coletar {
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Coleta um número inteiro do usuário com um valor mínimo e máximo permitido.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @param valorMin O valor mínimo permitido.
     * @param valorMax O valor máximo permitido.
     * @return O número inteiro coletado.
     */
    public static int coletarInt(String mensagemDeExibicao, int valorMin, int valorMax) {
        int numInteiro;

        while (true) {
            System.out.println(mensagemDeExibicao);
            if (sc.hasNextInt()) {
                numInteiro = sc.nextInt(); sc.nextLine();
                if (numInteiro >= valorMin && numInteiro <= valorMax) {
                    return numInteiro;
                } else {
                    System.out.printf("Erro! O valor deve estar entre %d e %d. Tente novamente.\n", valorMin, valorMax);
                }
            } else {
                System.out.printf("Erro! Entrada inválida. Digite um número inteiro entre %d e %d.\n", valorMin, valorMax);
                sc.nextLine();
            }
        }
    }

    /**
     * Coleta um número inteiro do usuário com um valor mínimo permitido.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @param valorMin O valor mínimo permitido.
     * @return O número inteiro coletado.
     */
    public static int coletarInt(String mensagemDeExibicao, int valorMin) {
        int numInteiro;

        while (true) {
            System.out.println(mensagemDeExibicao);
            if (sc.hasNextInt()) {
                numInteiro = sc.nextInt(); sc.nextLine();
                if (numInteiro >= valorMin) {
                    return numInteiro;
                } else {
                    System.out.printf("Erro! O valor deve ser maior ou igual a %d. Tente novamente.\n", valorMin);
                }
            } else {
                System.out.printf("Erro! Entrada inválida. Digite um número maior ou igual a %d.\n", valorMin);
                sc.nextLine();
            }
        }
    }

    /**
     * Coleta um número inteiro do usuário.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @return O número inteiro coletado.
     */
    public static int coletarInt(String mensagemDeExibicao) {
        int numInteiro;

        while (true) {
            System.out.println(mensagemDeExibicao);
            if (sc.hasNextInt()) {
                numInteiro = sc.nextInt(); sc.nextLine();
                return numInteiro;
            } else {
                System.out.println("Erro! Entrada inválida. Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    /**
     * Coleta um número de ponto flutuante do usuário com um valor mínimo e máximo permitido.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @param valorMin O valor mínimo permitido.
     * @param valorMax O valor máximo permitido.
     * @return O número de ponto flutuante coletado.
     */
    public static double coletarDouble(String mensagemDeExibicao, double valorMin, double valorMax) {
        double valor;

        while (true) {
            System.out.println(mensagemDeExibicao);
            String input = sc.nextLine().replace(",", ".");

            try {
                valor = Double.parseDouble(input);
                if (valor >= valorMin && valor <= valorMax) {
                    return valor;
                } else {
                    System.out.printf("Erro! O valor deve estar entre %f e %f. Tente novamente.\n", valorMin, valorMax);
                }
            } catch (NumberFormatException e) {
                System.out.printf("Erro! Entrada inválida. Digite um número entre %f e %f.\n", valorMin, valorMax);
            }
        }
    }

    /**
     * Coleta um número de ponto flutuante do usuário com um valor mínimo permitido.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @param valorMin O valor mínimo permitido.
     * @return O número de ponto flutuante coletado.
     */
    public static double coletarDouble(String mensagemDeExibicao, double valorMin) {
        double valor;

        while (true) {
            System.out.println(mensagemDeExibicao);
            String input = sc.nextLine().replace(",", ".");

            try {
                valor = Double.parseDouble(input);
                if (valor >= valorMin) {
                    return valor;
                } else {
                    System.out.printf("Erro! O valor deve ser maior ou igual a %f. Tente novamente.\n", valorMin);
                }
            } catch (NumberFormatException e) {
                System.out.printf("Erro! Entrada inválida. Digite um número maior ou igual a %f.\n", valorMin);
            }
        }
    }

    /**
     * Coleta um número de ponto flutuante do usuário.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @return O número de ponto flutuante coletado.
     */
    public static double coletarDouble(String mensagemDeExibicao) {
        double valor;

        while (true) {
            System.out.println(mensagemDeExibicao);
            String input = sc.nextLine().replace(",", ".");

            try {
                valor = Double.parseDouble(input);
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Erro! Entrada inválida. Digite um número.\n");
            }
        }
    }

    /**
     * Coleta uma string do usuário.
     *
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @return A string coletada. Corrige duplo espaçamento.
     */
    public static String coletarString(String mensagemDeExibicao){
        String string;

        while (true) {
            System.out.println(mensagemDeExibicao);
            string = sc.nextLine().trim().replaceAll("\\s+", " "); // Substitui múltiplos espaços em branco por um único espaço
            if (string.isEmpty()) {
                System.out.println("Tente novamente. A entrada não pode ser vazia.");
            } else {
                return string;
            }
        }
    }

    /**
     * Coleta uma String do Usuário.
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @param tamanhoDaString Estabelece um tamanho máximo para a String
     * @return A String coletada.
     */
    public static String coletarString(String mensagemDeExibicao, int tamanhoDaString) {

        String string;

        while (true) {
            System.out.println(mensagemDeExibicao);
            string = sc.nextLine().trim().replaceAll("\\s+", " ");

            if (string.length() == tamanhoDaString) {
                return string;
            } else {
                System.out.println("Tente novamente. A entrada deve ter exatamente " + tamanhoDaString + " caracteres.");
            }
        }
    }

    /**
     * Coleta uma resposta SIM ou NÃO (s/n) do usuário e retorna um boolean.
     * @param mensagemDeExibicao A mensagem exibida ao usuário para solicitar a entrada.
     * @return true ou false
     */
    public static boolean continuar(String mensagemDeExibicao) {
        while (true) {
            System.out.println(mensagemDeExibicao);
            String resposta = sc.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                return true;
            } else if (resposta.equals("n")) {
                return false;
            } else {
                System.out.println("Resposta inválida. Digite 's' para sim ou 'n' para não.");
            }
        }
    }

    public static void fecharScanner(){
        sc.close();
    }
}
