package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int range = 2;

            if (num == 1) cnt = 1;
            else {
                while ((range <= num)){
                    range = range + (cnt * 6);
                    cnt++;
                }
            }
        System.out.println(cnt);
    }
}
