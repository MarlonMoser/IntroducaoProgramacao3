/*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:


\normals

O valor n deve ser lido e deve ser maior do que 2. */

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiro = 8;
        System.out.println("Valor de n (deve ser maior que 2): ");
        int n = teclado.nextInt();
        if (n <= 2) {
            System.out.println("O numero deve ser maior que 2");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(primeiro);
                if (i % 2 == 0) {

                    primeiro += 2;

                } else {
                    primeiro = primeiro - 2;

                    primeiro = (primeiro * 2);

                }

            }
            System.out.println(primeiro);

        }
        teclado.close();
    }

}
