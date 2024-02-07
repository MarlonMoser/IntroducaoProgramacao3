import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contenc = 0;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Opção: ");
            int opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("Informe o nome do hóspede: ");
                teclado.nextLine();
                String nome = teclado.nextLine();

                System.out.print("Informe o número de diárias: ");
                int diaria = teclado.nextInt();

                double taxa;
                if (diaria < 15) {
                    taxa = 7.50;
                } else if (diaria == 15) {
                    taxa = 6.50;
                } else {
                    taxa = 5.00;
                }

                double totalPagar = (50.00 + taxa) * diaria;

                System.out.println("Nome do hóspede: " + nome);
                System.out.println("Total a ser pago: R$ " + totalPagar);

                contenc++;
            } else if (opcao == 2) {
                System.out.println("Número de contas encerradas: " + contenc);
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção incorreta!");
            }
        }

        teclado.close();
    }
}
