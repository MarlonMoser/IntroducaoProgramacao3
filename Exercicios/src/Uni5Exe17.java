import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double maior = 0, menor = Integer.MAX_VALUE;
        double totalalt = 0, media;
        int grupo = 0, inscricaoAlto = 0, inscricaoBaixo = 0;

        System.out.println("para finalizar digite 0 para o número de inscrição");

        while (true) {
            System.out.print("Insira o numero de inscrição do atleta: ");
            int insc = teclado.nextInt();
            grupo++;

            if (insc == 0) {
                break;
            }

            System.out.print("Altura do Altleta (em cm): ");
            double altura = teclado.nextDouble();
            totalalt += altura;

            if (altura < menor) {
                menor = altura;
                inscricaoBaixo = insc;
            }

            if (altura > maior) {
                maior = altura;
                inscricaoAlto = insc;
            }

        }
        media = totalalt / grupo;
        System.out
                .println("o altelta número " + inscricaoBaixo + " e o atleta mais baixo com " + menor + "cm de altura");
        System.out
                .println("o altelta número " + inscricaoAlto + " e o atleta mais baixo com " + maior + "cm de altura");
        System.out.println("A altura media dos jogadores e de " + media + "cm");

        teclado.close();
    }
}
