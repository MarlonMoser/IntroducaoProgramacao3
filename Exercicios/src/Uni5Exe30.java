import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor inicial (N): ");
        int N = teclado.nextInt();

        System.out.print("Informe o decremento (K): ");
        int K = teclado.nextInt();

        System.out.print("Informe o tamanho da mochila (M): ");
        int M = teclado.nextInt();

        int valorAtual = N;
        int mochila = 0;
        int mochilafora = 0;

        System.out.println("Elementos a serem colocados na mochila:");
        while (valorAtual > 0 && mochila < M) {
            System.out.print(valorAtual + " ");
            mochila += valorAtual;
            valorAtual -= K;
        }

        System.out.println("Elementos que entraram na mochila:");
        for (int i = N; i >= valorAtual + K; i -= K) {
            System.out.print(i + " ");
        }

        System.out.println("Elementos que ficaram fora da mochila:");
        for (int i = valorAtual; i > 0; i -= K) {
            System.out.print(i + " ");
            mochilafora += i;
        }

        System.out.println("Soma dos elementos que entraram na mochila: " + mochila);
        System.out.println("Soma dos elementos que ficaram fora da mochila: " + mochilafora);

        teclado.close();
    }
}
