package ex481;
public class Main {

    public static String converterParaBase(int numeroDecimal, int base) {
        if (base < 2 || base > 10) {
            return "Base inválida. A base deve estar entre 2 e 10";
        }

        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder resultado = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % base;
            resultado.insert(0, resto);
            numeroDecimal /= base;
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        int numeroDecimal = 231;
        int baseDesejada = 2;

        String resultado = converterParaBase(numeroDecimal, baseDesejada);

        System.out.println("Resultado na base " + baseDesejada + ": " + resultado);
    }
}
