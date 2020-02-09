public class Chapter1Part2Task1 {

    public static void main(String[] args) {

        double firstAngle;
        double secondAngle;
        double sum;

        firstAngle = Input.inputDouble("firstAngle");
        secondAngle = Input.inputDouble("secondAngle");
        sum = firstAngle + secondAngle;

        if (sum < 180){
            System.out.print("Треугольник с данными углами существует.");
            if (sum == 90)
                System.out.println(" Треугольник является прямоугольным.");
        }
        else
            System.out.println("Треугольника с данными углами не существует");
    }
}
