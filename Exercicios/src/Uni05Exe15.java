import java.util.Scanner;

public class Uni05Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome (Fim para sair): ");
        String aluno = teclado.next();
        while (!aluno.equals("Fim")) {
            double N1 = teclado.nextDouble();
            double N2 = teclado.nextDouble();

            System.out.println("Média: " + ((N1 + N2) / 2));
            System.out.println("Informe o nome (fim para sair): ");
            aluno = teclado.next();

        }
        
        teclado.close();
    }
    
}
