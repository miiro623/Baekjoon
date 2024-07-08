package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int change;
        int [][] changeArr = new int[num][4];
        for (int i = 0; i < num; i++) {
            change = Integer.parseInt(br.readLine());
            changeArr[i][0] = change / 25;
            change = change % 25;
            changeArr[i][1] = change / 10;
            change = change % 10;
            changeArr[i][2] = change / 5;
            change = change % 5;
            changeArr[i][3] = change;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(changeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
