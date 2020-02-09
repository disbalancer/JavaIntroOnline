public class Chapter1Past3Task6 {
    public static void main(String[] args) {

        int n = Input.inputNaturChislo("Сколько строк соответствий вывести? ");

        for (int i = 33; i < (n+33); i++) {
            System.out.println("Числу " + i + " соответствует символ -  " + (char)i);
        }
    }
}
