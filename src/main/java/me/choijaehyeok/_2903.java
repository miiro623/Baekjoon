package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int centerShift = 2;
        int result = 0;
        for (int i = 0; i < num; i++) {
            centerShift = (centerShift - 1) * 2 + 1 ;
            result = centerShift * centerShift;
        }
        System.out.println(result);
    }
}
