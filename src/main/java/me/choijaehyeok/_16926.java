package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int rotation  = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[row][col];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        int temp = 0;
        for (int i = col; i > 0; i--) {
            matrix[1][i] = matrix[row][i];

        }


    }
}
