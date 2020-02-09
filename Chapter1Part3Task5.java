import java.util.ArrayList;

public class Chapter1Part3Task5 {
    public static void main(String[] args) {
        double e;
        double a;
        double sum = 0;
        e = Input.inputDouble("e");

        for (int n = 1; n > 0; n++) {
            a = 1/Degree.posIntDegree(2, n) + 1/Degree.posIntDegree(3, n);
            if (a >= e)
                sum += a;
            else{
                System.out.println(a + " < " + e);
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
