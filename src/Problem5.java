
import java.io.File;
import java.util.Scanner;

public class Problem5 {

    public static void main(String args[]) throws Exception{
        try (Scanner scan = new Scanner(new File("data/prob05-2-in.txt"))) {

            int n = scan.nextInt();
            for (int x = 0; x < n; x++) {
                int partition = scan.nextInt();
                char[] word = scan.next().toCharArray();
                String ans = "";
                for (int y = 0; y < word.length; y++) {
                    if (y % partition != 0) {
                        ans = ans + word[y];
                    }
                }
                System.out.println(ans + " " + ans.length());
            }
            scan.close();
        }
    }
}
