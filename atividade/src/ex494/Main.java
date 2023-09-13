package ex494;

public class Main {
    public static void troca(int[] vetor, int indiceA, int indiceB) {
        int temp = vetor[indiceA];
        vetor[indiceA] = vetor[indiceB];
        vetor[indiceB] = temp;
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    troca(vetor, i, i + 1);
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }

    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};

        System.out.println("Vetor não ordenado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        bubbleSort(vetor);

        System.out.println("\nVetor ordenado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
