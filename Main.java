import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  String ten = "hà thị ninh";
        //   String TEN = ten.toUpperCase();
        //   int size = ten.length();
        //   int vitri = ten.indexOf("i");
        //   char kt7 = ten.charAt(7);
        //   String catten = ten.substring(7);

        //  System.out.println("Kích thước chuỗi: "+size);
        //  System.out.println("Họ và tên : "+TEN);
        //  System.out.println("Vị trí: "+vitri);
        //  System.out.println("Ký tự số 7 : "+kt7);
        //System.out.println("In tên : "+catten);

        double cannang = 56.5;
        double chieucao = 1.61;

        CalBMI calBMI = new CalBMI();
        calBMI.calculateBMI(cannang, chieucao);


        Scanner sc = new Scanner(System.in);
        Month month1 = new Month();
        month1.showMonth(sc);

        Scanner sc2 = new Scanner(System.in);
        month2 mon2 = new month2();
        mon2.monthShow(sc2);

        Scanner tri = new Scanner(System.in);
        Triangle canh = new Triangle();
        canh.Edge(tri);


    }

    
}
