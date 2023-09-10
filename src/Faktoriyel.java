import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, total = 1;

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        while (i <= n) {
            total *= i;
            i++ ;
        }
        System.out.println(total);


    }
}
