import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Katedilen kilometreyi giriniz = ");
        int km = inp.nextInt();
        double cost = 10 + km*2.2;
        cost = (cost < 20) ? 20 : cost;

        System.out.println("Taksi Ücreti = " + cost);
    }
}
