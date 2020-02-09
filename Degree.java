public class Degree {

    public static double rez;


    public static double posIntDegree(double numb, int degree){
        rez = 1;
        for (int i = 0; i < degree; i++) {
            rez *= numb;
        }
        return rez;
    }
}
