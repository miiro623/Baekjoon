package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[9];
        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            if(num[i] > max){
                max = num[i];
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);

    }
}
