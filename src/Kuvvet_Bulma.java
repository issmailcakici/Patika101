//  Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

import java.util.Scanner;

public class Kuvvet_Bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        int i4 = 1,  i5 =1 , t4 = 1 , t5 = 1 ;

        while (i4 < sayi) {
            i4 *= 4;
            i5 *= 5;
            if (i4 < sayi) {
                System.out.println("4'ün " + t4 +". kuvveti : " + i4);
                t4+=1;
            }
            if (i5 < sayi)
            {
                System.out.println("5'in " + t5 +". kuvveti : " + i5);
                t5+=1;
            }


        } // While
    } //Main
} // Class

