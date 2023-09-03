import java.util.Scanner;

public class Ucak_Bileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, yolculukTipi;

        double brFiyat = 0.1, mesafe;
        double tutar, indirim;

        double sonTutar = 0; // İndirim uygulanmış ödenecek miktar

        boolean isError = false; // Hata durumunu sorgulama

        System.out.print("Mesafe Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Tek Yön - 1\nGidiş Dönüş - 2\nYolculuk Tipini Giriniz : ");
        yolculukTipi = input.nextInt();
        tutar = (mesafe * brFiyat); // İndirim uygulanmadan önceki fiyat


        if (yas >= 0 && yas < 12) { //++
            sonTutar = (tutar / 2);
        } else if (yas >= 12 && yas < 24) {
            sonTutar = (tutar * 0.9);
        } else if (yas > 65) {
            sonTutar = (tutar * 0.7);
        } else if (yas >= 24 && yas <= 65) {
            sonTutar = sonTutar;
        }

        if (yolculukTipi == 2) {
            sonTutar = (sonTutar * 0.8);
        } else if (yolculukTipi == 1) {
            sonTutar = sonTutar;
        } else {
            isError = true;
        }

        if (mesafe > 0) { //++
            sonTutar = sonTutar;
        } else {
            isError = true;
        }

        if (isError == true) {
            System.out.println("Hatalı Veri Girdiniz ! ");
        } else {
            System.out.println("Ödemeniz Gereken Miktar : " + sonTutar);
        }

    } //main
} // class
