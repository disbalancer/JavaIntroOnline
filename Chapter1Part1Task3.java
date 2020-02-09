

public class Chapter1Part1Task3 {
    public static void main(String[] args) {

        double x;
        double y;

        double z;


        x = Input.inputDouble("x");
        y = Input.inputDouble("y");

        z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);

        if (Math.cos(x) == Math.cos(y)){
            System.out.println("Деление на ноль");
        }

        System.out.println("z= " + z);


    }
}
