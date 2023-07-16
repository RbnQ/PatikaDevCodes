import java.util.Scanner;

public class EventRcm {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Hava kaç derece?");
        int dgr = inp.nextInt();

        if(dgr < 5) System.out.println("Kayak yap!");
        else if(dgr > 5 && dgr < 15) System.out.println("Sinemaya git!");
        else if(dgr > 15 && dgr < 25) System.out.println("Pikniğe git!");
        else if(dgr > 25) System.out.println("Yüzmeye git!");
    }
}
