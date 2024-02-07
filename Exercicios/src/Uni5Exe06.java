import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadePessoas = 20;
        double somaAlturas = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = teclado.nextDouble();
            somaAlturas += altura;
        }

        double mediaAlturas = somaAlturas / quantidadePessoas;
        System.out.println("A média de altura das pessoas é: " + mediaAlturas);

        teclado.close();
    }
}
