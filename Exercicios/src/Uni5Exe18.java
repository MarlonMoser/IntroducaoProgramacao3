import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int casatot = 0;
        int audcan4 = 0;
        int audcan5 = 0;
        int audcan9 = 0;
        int audcan12 = 0;

        while (true) {
            System.out.print("Informe o número do canal (4, 5, 9, 12) ou 0 para encerrar: ");
            int canal = teclado.nextInt();

            if (canal == 0) {
                break;
            }
            if (canal != 4 && canal != 5 && canal != 9 && canal != 12) {
                System.out.println("Esse Canal não existe");
                break;
            }

            System.out.print("Informe o número de pessoas assistindo: ");
            int audiencia = teclado.nextInt();

            if (canal == 4) {
                audcan4 += audiencia;
            } else if (canal == 5) {
                audcan5 += audiencia;
            } else if (canal == 9) {
                audcan9 += audiencia;
            } else if (canal == 12) {
                audcan12 += audiencia;
            }

            casatot++;
        }

        System.out.println("Percentual de audiência por canal:");

        if (casatot > 0) {
            double persent4 = (double) audcan4 / casatot * 100;
            System.out.println("Canal 4: " + persent4 + "%");

            double persent5 = (double) audcan5 / casatot * 100;
            System.out.println("Canal 5: " + persent5 + "%");

            double persent9 = (double) audcan9 / casatot * 100;
            System.out.println("Canal 9: " + persent9 + "%");

            double persent12 = (double) audcan12 / casatot * 100;
            System.out.println("Canal 12: " + persent12 + "%");
        } else {
            System.out.println("Nenhuma casa visitada.");
        }

        teclado.close();
    }
}
