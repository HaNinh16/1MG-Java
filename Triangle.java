import java.util.Scanner;

public class Triangle {
    public void Edge(Scanner edge) {
        System.out.println("Nhập độ dài cạnh thứ nhất :");
        int canh1 = edge.nextInt();

        System.out.println("Nhập độ dài cạnh thứ hai :");
        int canh2 = edge.nextInt();

        System.out.println("Nhập độ dài cạnh thứ ba");
        int canh3 = edge.nextInt();

        int tong1 = canh1 + canh2;
        int tong2 = canh1 + canh3;
        int tong3 = canh3 + canh2;

        if (tong1 > canh3 && tong2 > canh2 && tong3 > canh1) {
            System.out.println("3 cạnh của tam giác");
        } else System.out.println("Ko phải 3 cạnh hình tam giác");
    }
}
