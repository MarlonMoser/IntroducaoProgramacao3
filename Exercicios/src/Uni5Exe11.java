public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoito = 0, soma = 0;
        for (int i = 1; i <= 16; i++) {
            if (i == 1) {
                biscoito = 1;
            }

            if (i > 1) {
                biscoito *= 3;
            }

            soma += biscoito;
        }
        System.out.println("a quantidade de bisoitos quebrados ao longo do dia foi de :" + soma);

    }
}
