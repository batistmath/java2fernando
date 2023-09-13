package ex487;

public class Main {
    public static void inverte(int[] vetor, int tamanho) {
        int[] vetorInvertido = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[i] = vetor[tamanho - 1 - i];
        }

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = vetorInvertido[i];
        }
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int tamanho = 5;

        inverte(vetor, tamanho);

        System.out.println("Vetor Invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
