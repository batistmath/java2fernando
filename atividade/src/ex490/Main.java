package ex490;

public class Main {
    public static int substituirCaracter(char[] vetor, int tamanho, char caractereSubstituir) {
        int totalSubstituido = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractereSubstituir) {
                vetor[i] = '*';
                totalSubstituido++;
            }
        }

        return totalSubstituido;
    }

    public static void main(String[] args) {
        char[] vetor = {'a', 'b', 'c', 'a', 'd', 'a'};
        int tamanho = 6;
        char caractereSubstituir = 'a';

        int totalSubstituido = substituirCaracter(vetor, tamanho, caractereSubstituir);

        System.out.println("Total de caracteres substituídos: " + totalSubstituido);
        System.out.print("Vetor após substituição: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
