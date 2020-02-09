public class Chapter1Part2Task5 {
    public static void main(String[] args) {
        double z, x;

        x = Input.inputDouble("x");

        if (x <= 3)
            z = x*x - 3*x + 9;
        else
            z = 1/(x*x*x + 6);
        System.out.println("F(x) = " + z);
    }
}
