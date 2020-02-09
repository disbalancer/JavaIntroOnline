public class Chapter1Part2Task4 {
    public static void main(String[] args) {

        double a, b, x, y, z;
        double holeMin1, holeMin2, brickMin1, brickMin2;

        System.out.println("Enter length and height of the hole");
        a = Input.inputDouble("A");
        b = Input.inputDouble("B");

        System.out.println("Enter length, width and height of the brick");
        x = Input.inputDouble("x");
        y = Input.inputDouble("y");
        z = Input.inputDouble("z");

        if (a < b){
            holeMin1 = a;
            holeMin2 = b;
        }
        else{
            holeMin1 = b;
            holeMin2 = a;
        }

        brickMin1 = x;
        brickMin2 = y;

        if (x < y && x < z){
            brickMin1 = x;
            if (y < z)
                brickMin2 = y;
            else
                brickMin2 = z;
        }

        if (y < x && y < z){
            brickMin1 = y;
            if (x < z)
                brickMin2 = x;
            else
                brickMin2 = z;
        }

        if (z < x && z < y){
            brickMin1 = z;
            if (x < y)
                brickMin2 = x;
            else
                brickMin2 = y;
        }


        if (holeMin1 <= brickMin1 && holeMin2 <= brickMin2)
            System.out.println("Кирпич пройдет скозь отверстие");
        else
            System.out.println("Кирпич не пролезет");

    }
}
