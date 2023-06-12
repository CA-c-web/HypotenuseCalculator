import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side x");
        x = scanner.nextDouble();
        System.out.println("enter side y");
        y = scanner.nextDouble();

        z= Math.sqrt((x*x)+(y*y));

        System.out.println("the hypotenuse is = " +z);



    }
}
