public class Chapter1Past3Task7 {
    public static void main(String[] args) {
        boolean isDiv;
        long m, n;
        m = Input.inputLongNaturChislo("Введите нижний предел m");
        n = Input.inputLongNaturChislo("Введтите верхний предел n");
        if (m > n){
            System.out.println("m не должно быть больше n");
            return;
        }

        for (long i = m; i < n; i++) {

            isDiv = false;
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i ; j++) {
                if (i%j == 0) {
                    isDiv = true;
                    System.out.print(j + " ");
                }
                if (j == (i-1) && isDiv)
                    System.out.println("");
            }
            if (!isDiv)
                System.out.println("делителей нет");

        }


    }
}
