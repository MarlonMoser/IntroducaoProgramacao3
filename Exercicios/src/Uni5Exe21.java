
public class Uni5Exe21 {
    public static void main(String[] args) {

        double chico = 1.50, ze = 1.10;
        int loop = 0;

        while (chico > ze) {

            chico += 0.02;
            ze += 0.03;
            loop++;
        }
        System.out.println("serão necessarios " + loop + " anos para Que Zé Seja maior");

    }
}
