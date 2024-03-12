package Ex04;

/*4º Escreva um código que receba uma String qualquer e a imprima de forma invertida.
     Ex.:
     Entrada: estude java
     Saída: avaj edutse
 */

public class Ex04 {
    public static void inverterString(String s){

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        inverterString("estude java");
    }
}
