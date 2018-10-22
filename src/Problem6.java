
import java.io.File;
import java.util.Scanner;

public class Problem6 {

    public static void main(String args[]) throws Exception{
        try (Scanner scan = new Scanner(new File("data/prob06-1-in.txt"))) {

            int n = scan.nextInt();
            for (int x = 0; x < n; x++) {
                int T = scan.nextInt();
                int T0 = scan.nextInt();
                int T1 = scan.nextInt();
                int C0 = scan.nextInt();
                int C1 = scan.nextInt();

                double m = ((double)(T1 - T0))/((double)(C1 - C0));
                double b = T1 - m * C1;

                System.out.println(((T-b)/m)/8);
            }
            scan.close();
        }
    }
}
