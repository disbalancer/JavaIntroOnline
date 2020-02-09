import java.math.BigDecimal;
import java.math.BigInteger;

public class Chapter1Past3Task4 {
    public static void main(String[] args) {
        int i = 0;


        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger step = BigInteger.valueOf(1);

        while (i < 200){
            a = a.multiply(b.multiply(b));
            b = b.add(step);
            i++;
        }
        System.out.println("Произведение квадратов первых двухста чисел равно " + a);
    }
}
