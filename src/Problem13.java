import java.io.File;
import java.util.Scanner;

public class Problem13 {

    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new File("data/prob13-1-in.txt"));
        double n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String name = scan.next();
            double RAh = scan.nextDouble();
            double RAm = scan.nextDouble();
            String next = scan.next();

           // System.out.println(sign);
        }
        scan.close();
    }
}
