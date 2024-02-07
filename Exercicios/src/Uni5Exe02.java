public class Uni5Exe02 {
    public static void main(String[] args) {

        int somapar = 0, somaimpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                somapar += i;
            else
                somaimpar += i;
        }
        System.out.println("Soma dos impares: " + somaimpar);
        System.out.println("soma dos pares: " + somapar);
    }

}
