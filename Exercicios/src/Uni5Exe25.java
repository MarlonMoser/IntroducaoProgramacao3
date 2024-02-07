/*Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, 
ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. 
A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.*/

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d = 0, e = 0;
        while (true) {
            System.out.print("Qual jogador ganhou a rodada? d (direita) / e (esquerda)");
            char pontos = teclado.next().toLowerCase().charAt(0);
            System.out.println(" ");

            if (pontos == 'd') {
                d++;
            }

            if (pontos == 'e') {
                e++;
            }
            System.out.println("a pontuação e de " + d + " para o jogaor a direita");
            System.out.println("a pontuação e de " + e + " para o jogaor a esquerda");
            System.out.println(" ");

            if (pontos != 'd' && pontos != 'e') {

                System.out.println("Esse jogador ñ existe");
            }

            if (d == 21 && d - e >= 2) {
                System.out.println("O jogador da direita ganhou Parabens");
                break;
            }

            if (e == 21 && e - d >= 2) {
                System.out.println("O jogador da esquerda ganhou Parabens");
                break;
            }

            if (d > 21 && d - e == 2) {
                System.out.println("O jogador da direita ganhou Parabens");
                break;
            }

            if (e > 21 && e - d == 2) {
                System.out.println("O jogador da esquerda ganhou Parabens");
                break;
            }
        }
        teclado.close();
    }

}
