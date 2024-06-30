package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [][] confetti = new int[num][2];
        boolean[][] check = new boolean[101][101];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            confetti[i][0] = Integer.parseInt(st.nextToken());
            confetti[i][1] = Integer.parseInt(st.nextToken());
            for (int j = confetti[i][0]; j < confetti[i][0] + 10; j++) {
                for (int k = confetti[i][1]; k < confetti[i][1] + 10; k++) {
                    if (!check[j][k]) {
                        check[j][k] = true;
                        sum ++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
