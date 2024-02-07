import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de n (maior que 2): ");
        int n = teclado.nextInt();

        if (n <= 2) {
            System.out.println("Valor inválido. Digite um valor maior que 2.");
        } else {
            double soma = 0;

            for (int i = 1; i <= n; i++) {
                double termoAtual = 1.0 / i;
                soma += termoAtual;
                System.out.println("Termo " + i + ": " + termoAtual);
            }

            System.out.println("Soma total: " + soma);
        }

        teclado.close();
    }
}
