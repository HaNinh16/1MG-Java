import java.util.Scanner;

public class Month {

     public void showMonth(Scanner sc){
         System.out.println("Nhập tháng: ");
         int month = sc.nextInt();
         if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
             System.out.println("Tháng có 31 ngày");
         } else if (month==4||month==6||month==9||month==11){
             System.out.println("Tháng có 30 ngày");
         } else if (month==2){
             System.out.println("Tháng có 28 hoặc 29 ngày");
         } if (month > 12 || month ==0){
             System.out.println("Ko phải là tháng trong năm");
         }
     }


}
