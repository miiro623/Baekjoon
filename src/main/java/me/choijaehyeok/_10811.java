package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketNum = Integer.parseInt(st.nextToken());
        int [] basket = new int[basketNum];
        int temp;
        for (int i = 0; i < basketNum; i++) {
            basket[i] = i + 1;
        }
        int num = Integer.parseInt(st.nextToken());



        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while (a - 1 < b - 1){
                temp = basket[a - 1];
                basket[a - 1] = basket[b - 1];
                basket[b - 1] = temp;
                a++;
                b--;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
