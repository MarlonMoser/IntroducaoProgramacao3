import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totalvenda = 0, totalcompra = 0, totallucro = 0;

        int dez = 0, dezavinte = 0, maisvinte = 0;

        // Entrada
        for (int i = 1; i <= 20; i++) {

            System.out.print("qual mercadoria você comprou:");
            String mercadoria = teclado.nextLine();

            System.out.print("quanto você pagou:");
            double pc = teclado.nextDouble();
            teclado.nextLine();

            System.out.print("Por quanto você vendeu:");
            double pv = teclado.nextDouble();
            teclado.nextLine();

            totalcompra += pc;
            totalvenda += pv;

            double lucro = (pv - pc) / pc * 100;

            // Ifs
            if (lucro < 10) {
                System.out.println("A " + mercadoria + " gerou um  lucro de: " + lucro + "%");
                dez++;
            }
            if (lucro >= 10 && lucro <= 20) {
                System.out.println("A " + mercadoria + " gerou um  lucro de: " + lucro + "%");
                dezavinte++;
            }
            if (lucro > 20) {
                System.out.println("A " + mercadoria + " gerou um  lucro de: " + lucro + "%");
                maisvinte++;
            }

        }
        System.out.println("o total de  Reais gastos em compras foram de: " + totalcompra);
        System.out.println("o total de  Reais adquiridos em vendas foram de: " + totalvenda);
        totallucro = (totalvenda - totalcompra) / totalcompra * 100;
        System.out.println("Conseguiu um lucro de: " + totallucro + "%");
        System.out.println("houve " + dez + " produtos que renderam ate 10% de lucro");
        System.out.println("houve " + dezavinte + " produtos que renderam 10% a 20% de lucro");
        System.out.println("houve " + maisvinte + " produtos que renderam mais de 20% de lucro");
        teclado.close();
    }
}