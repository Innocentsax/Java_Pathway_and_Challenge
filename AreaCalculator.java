public class AreaCalculator{

    // SOLUTION PATTER 2
    /* public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }*/

    // SOLUTION PATTERN 1
    public static void main(String[] arg){
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
    }
    public static double area(double radius){
        return (radius < 1) ? -1 : radius * radius * Math.PI;
    }

    public static double area (double x, double y){
        return (x < 0 || y < 0) ? -1.0 : x * y;
    }
}
