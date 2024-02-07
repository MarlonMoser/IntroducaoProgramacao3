/*Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, 
dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do 
pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. 
A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. 
Calcular e escrever:

quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
quantos trechos foram informados;
quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar. */

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nega = 0, informado = 0, concorda = 0, i = 0;
        double caro, pedagio, distancia;

        System.out.print("Qual e o valor maximo que Astolfo pretende pagar : ");
        caro = teclado.nextDouble();

        while (true) {
            i++;
            System.out.print("Qual e o custo do " + i + "º" + " pedagio que Astolfo passou? : ");
            pedagio = teclado.nextDouble();
            if (pedagio < 0) {
                break;
            }
            System.out.print("Qual a distancia percorrida ate este Pedagio? (em Km) : ");
            distancia = teclado.nextDouble();

            informado++;

            if (pedagio > caro) {
                nega++;
            }

            if (distancia > 150 && pedagio < caro) {
                concorda++;
            }

        }
        System.out.println(nega + " (trechos com valor acima do qual ele nega-se a pagar )");
        System.out.println(informado + " (quantidade de trechos informados)");
        System.out.println(concorda + " ( trechos acima de 150km com valor aceito por ele)");

        teclado.close();
    }
}
