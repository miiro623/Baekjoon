package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int result = 1;
        int [] temp = new int[10];
        for (int i = 0; i < 3; i++) {
            result *= num[i];
        }

        while (result > 0) {
            temp[result % 10]++;
            result /= 10;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
