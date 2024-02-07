import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorMulheres = 0;
        double somaAlturasMulheres = 0;
        int contadorPessoas = 0;
        double somaAlturas = 0;

        System.out.println("Digite a altura em centímetros e o sexo ('M' ou 'F') das pessoas:");
        System.out.println("Para encerrar, digite 0 para a altura.");

        while (true) {
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Sexo ('M' ou 'F'): ");
            char sexo = teclado.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                somaAlturasMulheres += altura;
                contadorMulheres++;
            }

            somaAlturas += altura;
            contadorPessoas++;
        }

        double mediaAlturaMulheres = somaAlturasMulheres / contadorMulheres;
        double mediaAlturaGrupo = somaAlturas / contadorPessoas;

        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " cm");
        System.out.println("Média de altura do grupo: " + mediaAlturaGrupo + " cm");

        teclado.close();
    }
}
