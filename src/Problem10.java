import java.io.File;
import java.util.Scanner;
//actually problem 11
public class Problem10 {

    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new File("data/prob11-2-in.txt"));
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        while(a != 0 && b!= 0 && c != 0){
            out:
            for(int x = -100; x < 100; x++){
                for(int y = -100; y < 100; y++){
                    double d1 = Math.sqrt((0 - x)*(0 - x) + (100 - y)*(100-y));
                    double d2 = Math.sqrt((-100 - x)*(-100 - x) + (-100 - y)*(-100-y));
                    double d3 = Math.sqrt((100 - x)*(100 - x) + (-100 - y)*(-100-y));

                    double p1 = d1 * d1 * a;
                    double p2 = d2 * d2 * b;
                    double p3 = d3 * d3 * c;

                    if(error(p1, p2) && error(p2, p3) && error(p3,p1)) {
                        System.out.println(x + " " + y);
                        break out;
                    }
                }
            }
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
        }

        scan.close();
    }

    public static boolean error(double a, double b){
        double range = 0.001;
        double ans = (a - b) / a;

        if(ans > range) return false;
        else return true;
    }
}
