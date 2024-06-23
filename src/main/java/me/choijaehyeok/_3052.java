package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] num = new int[10];
        int [] temp = new int[42];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            num[i] = num[i] % 42;
            temp[num[i]]++;
        }
        for (int i = 0; i < 42; i++) {
            if (temp[i] != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
