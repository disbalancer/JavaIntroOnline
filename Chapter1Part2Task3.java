public class Chapter1Part2Task3 {
    public static void main(String[] args) {

        double x1, x2, x3, y1, y2, y3;
        double k, b, f;

        x1 = Input.inputDouble("x1");
        y1 = Input.inputDouble("y1");
        x2 = Input.inputDouble("x2");
        y2 = Input.inputDouble("y2");
        x3 = Input.inputDouble("x3");
        y3 = Input.inputDouble("y3");

        k = (y1 - y2) / (x1 - x2);
        b = y1 - k*x1;
        f = k * x3 + b;

        if (y3 == f)
            System.out.println("Точка А(" + x1 + ";" + y1 + "), точка B("+ x2 + ";" + y2 +
                    ") и точка С(" + x3 + ";" + y3 + ") находятся на одной прямой.");
        else
            System.out.println("Точка А(" + x1 + ";" + y1 + "), точка B("+ x2 + ";" + y2 +
                    ") и точка С(" + x3 + ";" + y3 + ") не находятся на одной прямой.");




    }
}
