package Day6;

import java.util.Random;
import java.util.Scanner;

import static Day6.Nguyento.nguyento;

public class Main {
    public static void main(String[] args) {

        //In n số nguyên tố đầu tiên
        System.out.print("Nhập số n : ");
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int dem = scanner.nextInt();

        System.out.print(dem + " Số nguyên tố là : ");
        for (int i = 2; i < 100; i++) {
            if (nguyento(i) && count < dem) {
                System.out.print(i + "\t");
                count++;
            }
        }

        // Số nguyên tố < 100
        System.out.print("\nFor - Số nguyên tố là : ");
        for (int i = 0; i < 100; i++) {
            if (nguyento(i)) {
                System.out.print(i + "\t");
            }

        }


        // Tính giai thừa
        System.out.print("\n Tính giai thừa : ");
        Scanner gthua = new Scanner(System.in);
        int k = gthua.nextInt();
        System.out.println(" Giai thừa " + k + " là " + Factorial.calculateFactorial(k));

        //Kiểm tra số ngẫu nhiên có phải nguyên tố hay ko?
        Random rDom = new Random();
        int int_random = rDom.nextInt(100);
        System.out.println("Số radom là : " + int_random);

        boolean kq;
        kq = Nguyento.nguyento(int_random);
        if ( kq == true ) {
            System.out.println(int_random + " là số nguyên tố");
        } else {
        System.out.println( int_random + " ko phải số nguyên tố");
        }


    }
}
