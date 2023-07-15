import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String[] meyve = {"armut", "elma", "domates", "muz", "patlıcan"};
        double[] price = {2.14, 3.67, 1.11, 0.95, 5};
        int[] amount = new int[5];
        double total = 0;

        for (int i = 0; i<5; ++i){
            System.out.print("Kaç adet " + meyve[i] + " aldınız? 1");
            amount[i] = inp.nextInt();
        }
        for (int i = 0; i<5; ++i){
            total += amount[i]*price[i];
        }

        System.out.print("Alışveriş tutarınız = " + total);
    }
}
