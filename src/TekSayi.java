// tek bir sayı girilene kadar kullanıcıdan girişleri
// kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları
// toplayıp ekrana basan program

import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, total = 0 ;

        do {
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();
            if (sayi % 2 ==0 && sayi % 4 ==0 ) {
                total += sayi ;
            }

        } while ((sayi % 2) == 0) ;

        System.out.print("Toplam : " + total );

    } // Main
} // Class
