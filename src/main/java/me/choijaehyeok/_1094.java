package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1094 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x;
        x =Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (x != 0){
            cnt += x%2;
            x /= 2;
        }
        System.out.println(cnt);
    }
}