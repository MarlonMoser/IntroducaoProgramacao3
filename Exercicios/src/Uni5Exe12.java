import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("escrava um numero inteiro positivo, para fazer o Triangulo de Floyd");
        int n = teclado.nextInt();

        int numero = 1;
        // Processos
        for (int l = 1; l <= n; l++) {
            for (int c = 1; c <= l; c++) {
                System.out.println(numero + " ");
                numero++;
            }
            System.out.println();

        }

        teclado.close();
    }
}
