
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

    public static void main(String args[]) throws Exception{
        try (Scanner scan = new Scanner(new File("data/prob07-1-in.txt"))) {

            int n = scan.nextInt();
            for (int x = 0; x < n; x++) {
                char[] a = scan.next().toCharArray();
                char[] b = scan.next().toCharArray();
                char[] c = scan.next().toCharArray();
                String ans = "";
                boolean btrue;
                for(int i = 0; i < a.length; i++){
                    btrue = false;
                    char at = a[i];
                    two:
                    for(int j = 0; j < b.length; j++){
                        if(b[j] == at){
                            btrue = true;
                            b[j] = ' ';
                            break two;
                        }
                    }
                    three:
                    for(int k = 0; k < c.length; k++){
                        if(c[k] == at && btrue){
                            ans += at;
                            c[k] = ' ';
                            break three;
                        }
                    }
                }
                char[] ans2 = ans.toCharArray();
                Arrays.sort(ans2);

                for(char d : ans2){
                    System.out.print(d);
                }
                System.out.println();
            }
            scan.close();
        }
    }
}
