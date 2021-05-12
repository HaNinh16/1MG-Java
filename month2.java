import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class month2 {
    public void monthShow(Scanner sc2) {
        System.out.println("Nhập tháng check sl ngày :");
        int mon2 = sc2.nextInt();
        switch (mon2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày");
                break;
            case 0:
                System.out.println("Ko có tháng này trong năm");
                break;


        }

    }
}
