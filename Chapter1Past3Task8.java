public class Chapter1Past3Task8 {
    public static void main(String[] args) {

        long numb1, numb2;
        String s1, s2;

        numb1 = Input.inputLongNaturChislo("numb1");
        numb2 = Input.inputLongNaturChislo("numb2");
        s1 = String.valueOf(numb1);
        s2 = String.valueOf(numb2);



        char[] ar1 = s1.toCharArray();
        System.out.print("Число numb1 состоит из следующих цифер:");
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(" " + ar1[i]);
        }
        System.out.println("");

        char[] ar2 = s2.toCharArray();
        System.out.print("Число numb2 состоит из следующих цифер:");
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(" " + ar2[i]);
        }
        System.out.println("");

    }
}
