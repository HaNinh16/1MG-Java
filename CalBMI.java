public class CalBMI {


    public void calculateBMI(double cannang, double chieucao) {
        double BMI = cannang / (chieucao * chieucao);

        System.out.println("Chỉ số BMI : " + BMI);
        if (BMI < 18.5) {
            System.out.println("Thiếu cân");
        } else if (BMI > 24.9) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Cân đối");
        }
    }
}
