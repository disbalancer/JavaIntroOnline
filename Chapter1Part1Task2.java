
public class Chapter1Part1Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double z;


        a = Input.inputDouble("a");
        b = Input.inputDouble("b");
        c = Input.inputDouble("c");

        z = (b + Math.sqrt(b*b + 4*a*c))/(2*a)-a*a*a*c+1/(b*b);

        if ((b*b+4*a*c) < 0){
            System.out.println("Подкоренное выражение - отрицательное");
            return;
        }
        if (b == 0 || a == 0){
            System.out.println("Деление на ноль невозможно");
            return;
        }

        System.out.println(z);


    }
}
