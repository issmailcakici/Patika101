import java.util.Scanner;

public class EnBuyukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        System.out.print("Girmek İstediğiniz Sayı Adedini Giriniz : ");
        int adet = input.nextInt();


        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            int sayi = input.nextInt();

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }
        System.out.println();
        System.out.println("En küçük : " + enKucuk);
        System.out.println();
        System.out.println("En Büyük : " + enBuyuk);
    } // Main
} // Class
