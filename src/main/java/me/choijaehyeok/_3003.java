package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] blackChess = new int[6];
        int [] whiteChess = new int[6];
        blackChess[0] = 1;
        blackChess[1] = 1;
        blackChess[2] = 2;
        blackChess[3] = 2;
        blackChess[4] = 2;
        blackChess[5] = 8;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++){
            whiteChess[i] = Integer.parseInt(st.nextToken());
            whiteChess[i] = blackChess[i] - whiteChess[i];
        }
        for (int i = 0; i < 6; i++){
            System.out.print(whiteChess[i] + " ");
        }
    }
}
