package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketNum = Integer.parseInt(st.nextToken());
        int [] basket = new int[basketNum];
        int num = Integer.parseInt(st.nextToken());
        int [] ball = new int[3];


        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                ball[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = ball[0]; j <= ball[1]; j++) {
                basket[j - 1] = ball[2];
            }
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}