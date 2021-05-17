package Day6;

import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial (int p) {
        int gThua = 1;
        if ((p == 0) || (p == 1)) {
            return 1;
        } else {
            for (int i = 2; i <= p; i++) {
                gThua *= i;
            }
        }
        return gThua;
    }

    public static long caFactorial2 (int h) throws Exception {
        if (h < 0){
            throw new Exception( "Số nhỏ hơn 0");
        }
        if (h < 2)
            return 1;
        return caFactorial2(h-1)*h;

    }
}
