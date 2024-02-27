import java.util.Scanner;
public class Brutucret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen haftalik çalisma surenizi giriniz:");
        int calisma_suresi = scanner.nextInt();
        System.out.println("Saatlik ucretinizi giriniz");
        int saatlik_ucret = scanner.nextInt();

        double Haftalik_ücret;
        if (calisma_suresi<= 40)
            Haftalik_ücret = calisma_suresi * saatlik_ucret;
        else
            Haftalik_ücret = 40*saatlik_ucret + (calisma_suresi-40)*(saatlik_ucret*1.5);
        
        System.out.println("Haftalik ücretiniz:"+Haftalik_ücret);
        scanner.close();
    }
}