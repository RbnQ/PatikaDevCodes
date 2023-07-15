import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String correct_username = "patika";
        String correct_pass = "java123";

        System.out.println("Kullanıcı adı giriniz:");
        String username = inp.nextLine();

        System.out.println("Şifre giriniz:");
        String password = inp.nextLine();

        if(!(username.equals(correct_username))) System.out.println("Hatalı Kullanıcı adı!");
        else if (!(password.equals(correct_pass))) {
            System.out.println("Hatalı şifre !");
            System.out.println("Şifrenizi değiştirmek ister misiniz? E/H");
            String choice = inp.nextLine();
            if(choice.equals("E")){
                System.out.println("Yeni şifre giriniz:");
                String newpass1 = inp.nextLine();
                if(newpass1.equals(correct_pass)) System.out.println("Şifre oluşturulamadı. Başka bir şifre deneyin.");
                else{
                    System.out.println("Yeni şifreyi tekrar giriniz:");
                    String newpass2 = inp.nextLine();
                    if(newpass1.equals(newpass2)) System.out.println("Şifre oluşturulamadı. Başka bir şifre deneyin.");
                    else System.out.println("Şifre değiştirildi.");
                }
            }
        }
    }
}
