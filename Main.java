import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;

        System.out.print("Matematik notunu giriniz = ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz = ");
        fiz = inp.nextInt();

        System.out.print("Kimya notunu giriniz = ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunu giriniz = ");
        tur = inp.nextInt();

        System.out.print("Tarih notunu giriniz = ");
        tar = inp.nextInt();

        System.out.print("Müzik notunu giriniz = ");
        muz = inp.nextInt();

        double sum = (double) (mat + fiz + kim + tur + tar + muz) /6;
        System.out.println("Not Ortalaması = " + sum);
        System.out.print(sum > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}