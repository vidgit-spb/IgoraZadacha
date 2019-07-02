

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    int vNum = 3;
    int eNum = 4;
    boolean[] used = new boolean[3];
    boolean[][] a = new boolean[3][3];

    void Dfs(int i){
        used[i]=true;
        for (int nv = 0; nv < vNum;nv++){
            if(!used[nv]&& a[i][nv]){
                if (nv == 0){
                    System.out.print("Marat" + " ");
                }
                if(nv == 1){
                    System.out.print("Michail" + " ");
                }
                if(nv == 2){
                    System.out.print("Sveta" +" ");
                }
                Dfs(nv);
            }
        }
    }

    public void run(int i){

        a[0][0] = false;
        a[0][1] = false;
        a[0][2] = true;
        a[1][0] = false;
        a[1][1] = false;
        a[1][2] = false;
        a[2][0] = false;
        a[2][1] = true;
        a[2][2] = false;
        Dfs(i);

    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i == 0){
                System.out.print("Marata friends = ");
                new Solution().run(i);
                System.out.println();
            }
            if(i == 1){
                System.out.print("Michail friends = ");
                new Solution().run(i);
                System.out.println();
            }
            if(i == 2){
                System.out.print("Sveta friends = ");
                new Solution().run(i);
                System.out.println();
            }
        }

    }
}
