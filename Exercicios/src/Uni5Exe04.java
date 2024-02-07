public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0;
        double numera = 3;
        double deno = 2;
        double soma = 0;

        for (int i = 1; i <= 20; i++) {
            soma = numera / deno;

            System.out.println(soma);
            s += numera / deno;
            deno = numera + deno + 1;
            numera += 2;

        }

        System.out.println("O valor de S é: " + s);
    }
}
