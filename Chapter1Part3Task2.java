public class Chapter1Part3Task2 {
    public static void main(String[] args) {
        double a, b, h, y, x;

        h = 1;
        y = 0;

        a = Input.inputDouble("a");
        b = Input.inputDouble("b");
        h = Input.inputDouble("h");

        x = a;

        while (x <= b){
            if (x > 2)
                y = x;
            else
                y = -x;

        System.out.println("При x= " + x + " y= " + y);
        x += h;
        }

    }
}
