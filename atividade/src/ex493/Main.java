package ex493;

public class Main {
    public static String verificaOrdenacao(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;

        // Verifica se o vetor está em ordem crescente.
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i - 1] > vetor[i]) {
                crescente = false;
                break;
            }
        }

        // Verifica se o vetor está em ordem decrescente.
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i - 1] < vetor[i]) {
                decrescente = false;
                break;
            }
        }

        if (crescente) {
            return "Crescente";
        } else if (decrescente) {
            return "Decrescente";
        } else {
            return "Não ordenado";
        }
    }

    public static void main(String[] args) {
        int[] vetorCrescente = {1, 2, 3, 4, 5};
        int[] vetorDecrescente = {5, 4, 3, 2, 1};
        int[] vetorNaoOrdenado = {2, 1, 5, 3, 4};

        System.out.println("Vetor Crescente: " + verificaOrdenacao(vetorCrescente));
        System.out.println("Vetor Decrescente: " + verificaOrdenacao(vetorDecrescente));
        System.out.println("Vetor Não Ordenado: " + verificaOrdenacao(vetorNaoOrdenado));
    }
}