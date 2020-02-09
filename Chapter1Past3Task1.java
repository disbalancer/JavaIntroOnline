public class Chapter1Past3Task1 {
    public static void main(String[] args) {
        int i, z;
        z = 0;
        System.out.println("Введите натуральное число");
        i = Input.inputNaturChislo("i");
        for (int j = 1; j <= i; j++) {
            z += j;
        }
        System.out.println("Сумма первых " + i + " натуральных чисел равна " + z);
    }
}
