import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int numReabastecimentos = teclado.nextInt();

        double quilometragemTotal = 0;
        double litrosTotal = 0;

        double odometroAnterior = 0;

        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.print("Digite o odômetro atual: ");
            double odometroAtual = teclado.nextDouble();

            System.out.print("Digite a quantidade de combustível comprada (em litros): ");
            double quantidadeCombustivel = teclado.nextDouble();

            double quilometragemParada = (odometroAtual - odometroAnterior) / quantidadeCombustivel;

            System.out.printf("Quilometragem obtida por litro na parada %d: %.2f km/L%n", i, quilometragemParada);

            quilometragemTotal += (odometroAtual - odometroAnterior);
            litrosTotal += quantidadeCombustivel;

            odometroAnterior = odometroAtual;
        }

        double quilometragemMedia = quilometragemTotal / litrosTotal;

        System.out.printf("Quilometragem média obtida por litro em toda a viagem: %.2f km/L%n", quilometragemMedia);
        teclado.close();
    }
}
