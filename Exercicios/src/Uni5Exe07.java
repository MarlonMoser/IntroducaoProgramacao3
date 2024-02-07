import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = teclado.nextInt();

        double maior = 0;
        double menor = 999999999;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        teclado.close();
    }
}
