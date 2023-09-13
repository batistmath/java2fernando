package ex483;

public class Main {
    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2, int tamanho) {
        if (vetor1.length != tamanho || vetor2.length != tamanho) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho especificado.");
        }

        int produtoInterno = 0;

        for (int i = 0; i < tamanho; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }

        return produtoInterno;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int tamanho = 3;

        int resultado = calcularProdutoInterno(vetor1, vetor2, tamanho);

        System.out.println("Produto Interno: " + resultado);
    }
}
