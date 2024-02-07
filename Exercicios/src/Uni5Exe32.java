import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primdia = teclado.nextInt();

        System.out.print("Informe quantos dias tem o mês: ");
        int dias = teclado.nextInt();

        System.out.println("D  S  T  Q  Q  S  S");

        primdia = 0;
        int dia = 1;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && j < primdia) {
                    System.out.print("  ");
                } else if (dia <= dias) {
                    System.out.print(dia + "  ");
                    dia++;
                }
            }
            System.out.println();
        }

        teclado.close();
    }
}
