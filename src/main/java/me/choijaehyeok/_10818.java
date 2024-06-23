package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] numArr = new int[num];
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            if (numArr[i] > max) max = numArr[i];
            if (numArr[i] < min) min = numArr[i];
        }
        System.out.print(min + " ");
        System.out.print(max);
    }
}
