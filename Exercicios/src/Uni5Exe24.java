/*Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da
 pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo.
  Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a 
seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”. */

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double limite, peixe = 0, kg, peixeinicial = 0;
        char maisum = 's';

        System.out.print("Qual o limite diario (em Kg): ");
        limite = teclado.nextDouble();

        while (maisum == 's') {

            System.out.print("Qual e o peso do peixe (por favor digite em gramas):  ");
            kg = teclado.nextDouble();

            peixeinicial = kg / 1000.0;
            peixe += peixeinicial;

            if (peixe == limite) {
                break;
            }

            if (peixe > limite) {
                System.out.println("Você passou o limite diario, devolva o peixe a água!");
                break;
            }

            System.out.print("Deseja informar mais um peixe: s (SIM) / n (NÃO)");
            maisum = teclado.next().toLowerCase().charAt(0);

            if (maisum == 'n') {
                break;
            }

            if (maisum != 's' && maisum != 'n') {
                System.out.println("Digite novamente por favor");
            }

        }

        if (peixe == limite) {

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Você alcançou o limite diario!");
            System.out.print("Você pescou um total de " + peixe + "Kg");
            System.out.println(" Obrigado e volte sempre!");

        }
        if (peixe < limite) {

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Você pescou um total de " + peixe + "Kg");
            System.out.println(" Obrigado e volte sempre!");

        }
        teclado.close();
    }
}