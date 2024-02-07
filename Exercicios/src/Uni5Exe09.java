import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtde20 = 0;

        System.out.print("Quantos alunos possui a sala: ");
        int quantAlun = teclado.nextInt();
        teclado.nextLine();

        // Processos
        for (int i = 1; i <= quantAlun; i++) {
            System.out.print("qual o nome do " + i + " aluno: ");
            String aluno = teclado.nextLine();

            System.out.print("qual e a idade do " + i + " aluno: ");
            int idade = teclado.nextInt();
            teclado.nextLine();

            if (idade == 18) {
                System.out.println(aluno + " tem 18 anos");
            }

            if (idade > 20) {
                qtde20++;
            }
        }

        // Saida
        System.out.println("Na sala há  " + qtde20 + " alunos com mais de 20 anos");

        teclado.close();
    }

}
