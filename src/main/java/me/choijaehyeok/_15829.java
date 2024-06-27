package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        long r = 1;
        int m = 1234567891;
        for(int i = 0; i < l; i++) {
            result += ((str.charAt(i) - 96) * r);
            r = (r * 31) % m;
        }
        System.out.println(result % m);
    }
}
