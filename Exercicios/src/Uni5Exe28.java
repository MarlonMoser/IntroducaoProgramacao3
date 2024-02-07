import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        char votos = 's';
        int cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0, totalvot = 0;

        while (votos == 's') {

            System.out.println(" mais um voto: s (SIM) / n (NÃO)? ");
            votos = teclado.next().toLowerCase().charAt(0);

            if (votos == 'n') {
                break;
            }

            if (votos != 's' && votos != 'n') {
                System.out.println("Digite novamente por favor");
            }

            System.out.println("Codigo 1| Nenhum de Nós");
            System.out.println("Codigo 2| CPM22");
            System.out.println("Codigo 3| Skank");
            System.out.println("Codigo 4| Jota Quest");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    cod1++;
                    totalvot++;
                    break;

                case 2:
                    cod2++;
                    totalvot++;
                    break;

                case 3:
                    cod3++;
                    totalvot++;
                    break;

                case 4:
                    cod4++;
                    totalvot++;
                    break;

                default:
                    System.out.println("Opção Invalida");
            }

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("o total de votos para cada grupo foi de :");
        System.out.println("Grupo 1 :" + cod1 + " votos");
        System.out.println("Grupo 2 :" + cod2 + " votos");
        System.out.println("Grupo 3 :" + cod3 + " votos");
        System.out.println("Grupo 4 :" + cod4 + " votos");
        System.out.println(" ");

        double percentualGrupo1 = (cod1 / (double) totalvot) * 100;
        double percentualGrupo2 = (cod2 / (double) totalvot) * 100;
        double percentualGrupo3 = (cod3 / (double) totalvot) * 100;
        double percentualGrupo4 = (cod4 / (double) totalvot) * 100;

        System.out.println("Percentual de votos para o Grupo 1: " + df_2.format(percentualGrupo1) + "%");
        System.out.println("Percentual de votos para o Grupo 2: " + df_2.format(percentualGrupo2) + "%");
        System.out.println("Percentual de votos para o Grupo 3: " + df_2.format(percentualGrupo3) + "%");
        System.out.println("Percentual de votos para o Grupo 4: " + df_2.format(percentualGrupo4) + "%");

        if (percentualGrupo1 > percentualGrupo2 && percentualGrupo1 > percentualGrupo3
                && percentualGrupo1 > percentualGrupo4) {
            System.out.println("O Grupo 1 é o vencedor!");
        } else if (percentualGrupo2 > percentualGrupo1 && percentualGrupo2 > percentualGrupo3
                && percentualGrupo2 > percentualGrupo4) {
            System.out.println("O Grupo 2 é o vencedor!");
        } else if (percentualGrupo3 > percentualGrupo1 && percentualGrupo3 > percentualGrupo2
                && percentualGrupo3 > percentualGrupo4) {
            System.out.println("O Grupo 3 é o vencedor!");
        } else if (percentualGrupo4 > percentualGrupo1 && percentualGrupo4 > percentualGrupo2
                && percentualGrupo4 > percentualGrupo3) {
            System.out.println("O Grupo 4 é o vencedor!");
        } else {
            System.out.println("Não houve um vencedor claro. Houve um empate ou nenhum grupo recebeu votos.");
        }
        teclado.close();
    }
}
