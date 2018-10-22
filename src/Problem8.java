
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

    public static void main(String args[]) throws Exception{
        try (Scanner scan = new Scanner(new File("data/prob07-1-in.txt"))) {

            int n = scan.nextInt();
            for (int x = 0; x < n; x++) {
                char[] in = scan.next().toCharArray();
                int count = 0;
                int n2 = in.length;
                boolean swit = false;
                for(int i = in.length; i > 0; i--){
                    for(int j = 0; j < n2; j++){
                        if(count < in.length) System.out.print(" ");
                    }
                        n2--;
                        for(int k = 0; k < count; k++) {
                            System.out.print(in[k]);
                        }
                        if(count < in.length && !swit) count++;
                        else if(count == in.length) count --;
                        else count--;

                        if(count == in.length) swit = true;

                        System.out.println();
                    }
                /* backwards */

                count = 0;
                for(int i = in.length; i > 0; i--){

                    n2--;
                    for(int k = 0+count; k < in.length; k++) {
                        System.out.print(in[k]);
                    }
                    if(count < in.length) count++;
                    else if(count == in.length) count --;
                    else count--;


                    System.out.println();
                }
            }
            scan.close();
        }
    }
}
