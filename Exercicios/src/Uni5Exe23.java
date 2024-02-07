/*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, 
onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório 
com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado.
 Para prosseguir com a entrada de dados o algoritmo deve apresentar a 
 seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”.
  O número de produtos (n) de cada vendedor deve ser informado. */

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char maisum = 's';
        double salario, vendas, salafin = 0, totalven = 0;
        // Entardas
        while (maisum == 's') {

            System.out.print("Informe o nome do vendedor: ");
            String vendedor = teclado.nextLine();

            System.out.print("Informe a quantidade de vendas desse vendedor:");
            int quant = teclado.nextInt();

            for (int i = 1; i <= quant; i++) {
                System.out.print("Qual foi o valor da " + i + " º" + " venda: ");
                vendas = teclado.nextDouble();

                salario = vendas * 0.30;
                salafin += salario;
                salario = 0;

                totalven += vendas;
                vendas = 0;

            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("O vendedor(ora): " + vendedor);
            System.out.println("Fez um total de: " + totalven + "$ em vendas");
            System.out.println("Assim obtendo um salario de " + salafin + "$");

            System.out.println("deseja digitar os dados de mais um vendedor: s(SIM) /n(NÂO)");
            maisum = teclado.next().toLowerCase().charAt(0);

            if (maisum == 'n') {
                break;
            }

        }
        System.out.println("Obrigado por usar nossos Sistemas, e não vem reclamar cliente <3");
        teclado.close();
    }
}
