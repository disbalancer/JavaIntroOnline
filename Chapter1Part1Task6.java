public class Chapter1Part1Task6 {

    public static void main(String[] args) {

        boolean hit = false;
        int x;
        int y;

        int[][] array = new int[8][9];

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4 ; i++) {
                if (j >= 2 || j <= 6)
                    continue;
                array [i][j] = 1;
            }
        }

        array[5][4] = 1;

        x = Input.inputInteger("x");
        x = 4 + x;
        y = Input.inputInteger("y");
        y = 4 - y;


        try {
            if (array[y][x] == 0)
                hit = true;
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println(hit);

    }
}
