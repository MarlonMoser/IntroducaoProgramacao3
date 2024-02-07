public class Uni5Exe10 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;

        while (contador < 10) {
            int quadrado = numero * numero;
            String quadradoStr = String.valueOf(quadrado);
            int tamanho = quadradoStr.length();

            for (int i = 1; i < tamanho; i++) {
                String parte1Str = quadradoStr.substring(0, i);
                String parte2Str = quadradoStr.substring(i);

                int parte1 = Integer.parseInt(parte1Str);
                int parte2 = Integer.parseInt(parte2Str);

                if (parte1 + parte2 == numero) {
                    System.out.println(numero);
                    contador++;
                    break;
                }
            }

            numero++;
        }
    }
}
