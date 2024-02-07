import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int can1 = 0, can2 = 0, can3 = 0, can4 = 0;
        int nulos = 0, votosBrancos = 0, total = 0, voto;

        do {
            System.out.print("Informe o voto (1 a 4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar): ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    can1++;
                    break;

                case 2:
                    can2++;
                    break;

                case 3:
                    can3++;
                    break;

                case 4:
                    can4++;
                    break;

                case 5:
                    nulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                case 0:
                    break;
                default:

                    System.out.println("Opção incorreta!");
                    break;
            }

            total++;
        } while (voto != 0);

        System.out.println("Resultado da eleição:");
        System.out.println("Total de votos para o Candidato 1: " + can1);
        System.out.println("Total de votos para o Candidato 2: " + can2);
        System.out.println("Total de votos para o Candidato 3: " + can3);
        System.out.println("Total de votos para o Candidato 4: " + can4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Percentual de votos nulos sobre o total: " + (double) nulos / total * 100 + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + (double) votosBrancos / total * 100 + "%");

        teclado.close();
    }
}
