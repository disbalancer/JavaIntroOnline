public class Chapter1Part1Task4 {

    public static void main(String[] args) {
        double a;
        String f;

        a = Input.inputDouble("a");
        if (a < 100 ^ a >= 1000){
            System.out.println("Введенное число должно иметь вид ddd.nnn.");
            return;
        }

        f = Double.toString(a);

        if (f.length() != 7){
            System.out.println("Введенное число должно иметь вид ddd.nnn.");
            return;
        }
        char[] array = f.toCharArray();

        f = Character.toString(array[4]) + Character.toString(array[5]) + Character.toString(array[6]) +
            Character.toString(array[3]) + Character.toString(array[0]) + Character.toString(array[1]) +
            Character.toString(array[2]);

        System.out.println(f);

    }
}
