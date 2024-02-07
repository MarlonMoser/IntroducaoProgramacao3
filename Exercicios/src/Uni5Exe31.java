import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = teclado.nextInt();

        System.out.println("Decomposição");
        while (numero > 1) {
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(numero + " " + i);
                    numero /= i;
                    break;
                }
            }
        }

        teclado.close();
    }
}
