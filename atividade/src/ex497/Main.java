package ex497;

public class Main {
    public static int buscaBinaria(int[] vetor, int tamanho, int chave) {
        int esquerda = 0;
        int direita = tamanho - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetor[meio] == chave) {
                return meio; // Chave encontrada, retorna a posição.
            } else if (vetor[meio] < chave) {
                esquerda = meio + 1; // Busca na metade direita.
            } else {
                direita = meio - 1; // Busca na metade esquerda.
            }
        }

        return -1; // Chave não encontrada.
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tamanho = 9;
        int chave = 5;

        int posicao = buscaBinaria(vetor, tamanho, chave);

        if (posicao != -1) {
            System.out.println("Chave encontrada na posição " + posicao);
        } else {
            System.out.println("Chave não encontrada no vetor.");
        }
    }
}
