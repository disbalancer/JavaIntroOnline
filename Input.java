import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static double inputDouble(String var){
        double x = 0;

        System.out.println("Введите значение переменной " + var);
        try {
            x = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение нельзя привести к типу Double");
            inputDouble(var);
        } catch (IOException e){
            inputDouble(var);
        }
        return x;
    }

    public static int inputNaturChislo(String var){
        int n = 0;

        System.out.println("Введите натуральное число " + var);

        try {
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение нельзя привести к типу Integer");
            inputNaturChislo(var);
        } catch (IOException e){
            inputNaturChislo(var);
        }

        if (n < 1){
            System.out.println("Введенное число не является натуральным");
            inputNaturChislo(var);
        }
        return n;

    }

    public static int inputInteger(String var){
        int i = 0;

        System.out.println("Введите целое число " + var);

        try {
            i = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение нельзя привести к типу Integer");
            inputInteger(var);
        } catch (IOException e){
            inputInteger(var);
        }

        return i;
    }

    public static long inputLongNaturChislo(String var) {
        long n = 0;

        System.out.println("Введите натуральное число " + var);

        try {
            n = Long.parseLong(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение нельзя привести к типу Long");
            inputNaturChislo(var);
        } catch (IOException e) {
            inputNaturChislo(var);
        }

        if (n < 1) {
            System.out.println("Введенное число не является натуральным");
            inputNaturChislo(var);
        }
        return n;
    }
}
