import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double massafim = 0;
        int loop = 0;

        System.out.println("qual e a massa do material");
        double massa = teclado.nextDouble();
        double inicioMassa = massa;

        while (massa > 0.5) {

            massafim = massa / 2;
            massa = massafim;
            loop++;
        }
        System.out.println("A massa Inicial foi de :" + inicioMassa);
        System.out.println("A massa final foi de :" + massafim);
        int seg = loop * 50;
        int horas = seg / 3600;
        int minutos = (seg % 3600) / 60;
        int segundosRestantes = seg % 60;
        System.out.println("O tempo foi de:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosRestantes);

        teclado.close();
    }
}
