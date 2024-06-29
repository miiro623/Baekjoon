package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int aResult;
        int bResult;

        aResult = (a % 10) * 100;
        a = a / 10;
        aResult = aResult + (a % 10)*10;
        a = a / 10;
        aResult = aResult + a % 10;

        bResult = (b % 10) * 100;
        b = b / 10;
        bResult = bResult + (b % 10)*10;
        b = b / 10;
        bResult = bResult + b % 10;

        if (aResult >= bResult) {
            System.out.println(aResult);
        }else System.out.println(bResult);
    }
}
