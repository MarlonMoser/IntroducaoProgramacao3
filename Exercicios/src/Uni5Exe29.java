import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor a ser sacado: ");
        int valor = teclado.nextInt();

        int nota20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int nota5 = valor / 5;
        valor %= 5;

        int nota2 = valor / 2;
        valor %= 2;

        int moedas1 = valor;

        System.out.println("Quantidade de cédulas:");
        System.out.println("R$ 20: " + nota20);
        System.out.println("R$ 10: " + notas10);
        System.out.println("R$ 5: " + nota5);
        System.out.println("R$ 2: " + nota2);
        System.out.println("R$ 1: " + moedas1);

        teclado.close();
    }
}
