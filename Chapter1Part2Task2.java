public class Chapter1Part2Task2 {

    public static void main(String[] args) {

        double min1;
        double min2;
        double max;
        double[] array = new double[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = Input.inputDouble("№" + (i+1));
        }

        if (array[0] < array[1])
            min1 = array[0];
        else
            min1 = array[1];

        if (array[2] < array[3])
            min2 = array[2];
        else
            min2 = array[3];

        if (min1 > min2)
            max = min1;
        else
            max = min2;

        System.out.println("Наибольшее число: " + max);
    }
}
