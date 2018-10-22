import java.io.File;
import java.util.Scanner;

public class Problem4 {

    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new File("data/prob04-1-in.txt"));
        double a = -1;
        double b = -1;
        while(a != 0 && b!= 0){
             a = scan.nextDouble();
             b = scan.nextDouble();
            if(a == 0 && b == 0) break;

             b = Math.pow(10, b);
             double ans = a * b;
            System.out.printf("%.2f\n",ans);
        }

        scan.close();
    }
}
