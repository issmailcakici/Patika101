// kullanıcının girdiği değerler ile üslü sayı hesaplayan program
import java.util.Scanner;
public class Us_Alma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 1;
        int i = 0;

        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        System.out.print("Üs Giriniz : ");
        int us = input.nextInt();

        while (i < us) {
            total = total * sayi;
            i++;
        }
        System.out.println(total);


    }
}
