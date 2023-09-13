package ex485;

public class Main {
    public static void imprimirCaracteres(int[] numeros, char[] caracteres, int tamanho) {
        if (numeros.length != tamanho || caracteres.length != tamanho) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho especificado.");
        }

        for (int i = 0; i < tamanho; i++) {
            int vezes = numeros[i];
            char caractere = caracteres[i];

            for (int j = 0; j < vezes; j++) {
                System.out.print(caractere);
            }
        }
        System.out.println(); // Para adicionar uma quebra de linha no final da impressão.
    }

    public static void main(String[] args) {
        int[] numeros = {3, 2, 4};
        char[] caracteres = {'A', 'B', 'C'};
        int tamanho = 3;

        imprimirCaracteres(numeros, caracteres, tamanho);
    }
}
