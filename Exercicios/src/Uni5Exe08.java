import java.util.Scanner;

public class Uni5Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entradas
    System.out.println("informe a quantidade de numeros que vai adicionar: ");
    int quantidade = teclado.nextInt();
    int negativa = 0, positivo = 0, rept = 0;
    double media;

    // Processos

    for (int i = 1; i <= quantidade; i++) {
      System.out.println("informe o " + i + " número");
      int numero = teclado.nextInt();

      if (numero < negativa) {
        negativa = numero;
      }
      if (numero > 0) {
        rept++;
        positivo += numero;
        numero -= numero;

      }
    }
    media = positivo / rept;
    // Saida

    System.out.println("o menor valor negativo e: " + negativa);
    System.out.println(" a media dos números positivos e de: " + media);

    teclado.close();

  }
}
