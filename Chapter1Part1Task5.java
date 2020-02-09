public class Chapter1Part1Task5 {

    public static void main(String[] args) {
        int time;
        int h;
        int m;
        int s;
        time = Input.inputNaturChislo("time");

        h = time / 3600;
        time = time - 3600*h;
        m = time / 60;
        s = time - 60*m;

        System.out.println(h + "ч " + m + "мин " + s + "с");
    }
}
