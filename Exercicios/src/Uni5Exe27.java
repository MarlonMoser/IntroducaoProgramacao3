import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;
        int producaoManha, producaoTarde;
        double valorDiario;

        do {
            System.out.print("Digite o dia do mês de abril (1 a 30): ");
            dia = teclado.nextInt();
        } while (dia < 1 || dia > 30);

        do {
            System.out.print("Digite a produção de peças no turno da manhã: ");
            producaoManha = teclado.nextInt();
            System.out.print("Digite a produção de peças no turno da tarde: ");
            producaoTarde = teclado.nextInt();
        } while (producaoManha < 0 || producaoTarde < 0);

        if (dia <= 15) {
            if (producaoManha >= 30 && producaoTarde >= 30 && producaoManha + producaoTarde > 100) {
                valorDiario = 0.80;
            } else {
                valorDiario = 0.50;
            }
        } else {
            valorDiario = (producaoManha * 0.40) + (producaoTarde * 0.30);
        }

        System.out.println("O valor a ser recebido pelo funcionário é: R$" + valorDiario);

        System.out.print("Novo funcionário (1.sim 2.não)? ");
        int opcao = teclado.nextInt();
        if (opcao != 1) {
            System.out.println("Encerrando o programa.");
            System.exit(0);
        }
        teclado.close();

    }
}
