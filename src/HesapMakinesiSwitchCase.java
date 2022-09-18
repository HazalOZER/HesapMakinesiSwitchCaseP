import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz:");
        double num1= scan.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz:");
        double num2= scan.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemin rakam kodunu giriniz \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int sel= scan.nextInt();

        switch (sel){
            case 1:
                System.out.println("Girdiğiniz sayıların Toplamı: "+(num1 + num2));
                break;
            case 2:
                System.out.println("Girdiğiniz Sayıların Çıkarması"+(num1 - num2));
                break;
            case 3:
                System.out.println("Girdiğiniz sayıların Çarpımı: "+(num1 * num2));
                break;
            case 4:
                switch ((int) num2){
                    case 0:
                        System.out.println("Sayı sıfıra bölünemez");
                        break;
                    default:
                        System.out.println("Girdiğiniz sayıların bölümü: "+(num1/num2));
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız lütfen tekrar deneyiniz");
                break;

        }


    }
}
