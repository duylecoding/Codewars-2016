import java.io.File;
import java.util.Scanner;

public class Problem9 {

    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new File("data/prob09-1-in.txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        while(a != 0 && b!= 0 && c != 0){
           int painted = (a-2) * (b-2) * (c-2);
           int unpainted = a * b * 2 + a * (c-2) * 2 + (b-2) * (c-2) * 2;
            System.out.println(painted + " " + unpainted);
           if(painted == unpainted) System.out.println("A " + a + "x" + b + "x" + c + " block is PERFECT");
           else if(unpainted > painted) System.out.println("A " + a + "x" + b + "x" + c + " block is MORE than PERFECT");
           else System.out.println("A " + a + "x" + b + "x" + c + " block is LESS than PERFECT");

           a = scan.nextInt();
           b = scan.nextInt();
           c = scan.nextInt();
        }

        scan.close();
    }
}
