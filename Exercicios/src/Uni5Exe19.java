import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorTotal = 0;
        while (true) {

            System.out.print("Qual e o Valor da compra:(coloque 0 pra sair) ");
            double valor = teclado.nextDouble();
            valorTotal += valor;
            if (valor == 0) {
                break;
            }

            if (valor > 500) {
                double desconto = valor * 0.20;
                double compra = valor - desconto;
                System.out.println("a Compra custou: " + compra);
                System.out.println("com um desconto de :" + desconto);
            }

            if (valor <= 500) {
                double desconto = valor * 0.15;
                double compra = valor - desconto;
                System.out.println("a Compra custou: " + compra);
                System.out.println("com um desconto de :" + desconto);
            }

        }
        System.out.println("o valor total ganho pela empresa no final do dia foi de(fora os descontos): " + valorTotal);
        teclado.close();
    }
}
