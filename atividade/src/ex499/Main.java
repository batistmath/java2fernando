package ex499;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("MENU VETOR - FUNÇÃO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPÇÃO: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lerDadosVetor(vetor, scanner);
                    break;
                case 2:
                    ordenarVetor(vetor);
                    break;
                case 3:
                    imprimirVetor(vetor);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void lerDadosVetor(int[] vetor, Scanner scanner) {
        System.out.println("Digite 5 números inteiros para preencher o vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado com sucesso.");
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Conteúdo do vetor:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
