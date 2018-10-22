import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {

    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new File("data/prob12-2-in.txt"));
        int r = scan.nextInt();
        int c = scan.nextInt();
        scan.nextLine();
        char[][] puzzle = new char[r][c];

        //build matrix
        for(int i=0; i < r; i++){
            char[] line = scan.nextLine().toCharArray();
            for(int j = 0; j < c; j++){
                puzzle[i][j] = line[j];
            }
        }
        //print
        for(int i2=0; i2 < r; i2++){
            for(int j2 = 0; j2 < c; j2++){
                System.out.print(puzzle[i2][j2]);
            }
            System.out.println();
        }

        //begin solve
        String ans = "";
        //0 = down, 1 = up, 2 = left, 3 = right
        int dir;
        int i = 0;
        int j = 0;
        int delta = 0;
        if(puzzle[0][0] == ' '){
             dir = 0;
             i = 0;
             j = 0;
        } else if(puzzle[0][c-1] == ' '){
            dir = 2;
            i = 0;
            j = c-1;
        } else if(puzzle[r-1][0] == ' '){
            dir = 3;
            i = r-1;
            c = 0;
        } else {
            dir = 1;
            i = r-1;
            j = c-1;
        }
        int vertC = r-1;
        int horiC = c-1;
        int turnC = 0;
        while(true){
            System.out.println(ans);
            if(i == (r/2) && j == (c/2)) break;
            if(dir == 0){ // down
                if(turnC == 3){
                    turnC = 0;
                    vertC--;
                    horiC -=2;
                }
                for(int q = 0; q < vertC; q++){
                    ans += puzzle[i][j];
                    i++;
                }
                turnC++;
                dir = 3;
            } else if(dir == 1){ // up
                if(turnC == 3){
                    turnC = 0;
                    vertC--;
                    horiC -=2;
                }
                for(int q = 0; q < vertC; q++){
                    ans += puzzle[i][j];
                    i--;
                }
                turnC++;
                dir = 2;
            } else if(dir == 2){ // left
                if(turnC == 3) {
                    turnC = 0;
                    vertC-=2;
                    horiC--;
                }
                for(int q = 0; q < horiC; q++){
                    ans += puzzle[i][j];
                    j--;
                }
                turnC ++;
                dir = 0;
            }else{ // right
                if(turnC == 3) {
                    turnC = 0;
                    vertC-=2;
                    horiC--;
                }
                for(int q = 0; q < horiC; q++){
                    ans += puzzle[i][j];
                    j++;
                }
                turnC++;
                dir = 1;
            }
        }
        char[] rev = ans.toCharArray();
        //ans  = "";
        for(int z = rev.length-1; z >=0; z--){
           // if(rev[z] != ' ') ans += rev[z];
        }
        System.out.println(ans);


        scan.close();
    }
}
