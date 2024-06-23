package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String numStr = br.readLine();
        char[] temp = numStr.toCharArray();
        int sum = 0;
        int [] numArr = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            numArr[i] = temp[i] - 48;
            sum += numArr[i];
        }
        System.out.println(sum);
    }
}
