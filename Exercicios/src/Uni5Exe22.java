import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double salario = 2000, aumento = 1.5;
        int ano = 1995;
        while (ano < 2023) {

            ano++;
            salario = salario + (salario * aumento / 100);
            aumento *= 2;

        }
        System.out.println("o Salaraio em 2023 e" + df_2.format(salario));
    }
}
