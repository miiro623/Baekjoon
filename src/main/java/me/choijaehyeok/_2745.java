package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        char[] ch = num.toCharArray();
        int base = Integer.parseInt(st.nextToken());
        int [] baseArr = new int[ch.length];
        for (int i = 0; i < baseArr.length; i++) {
            Arrays.fill(baseArr, 1);
        }
        int[] result = new int [ch.length];
        int output = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                result[i] = ch[i] - 'A' + 10;
            }else{
                result[i] = ch[i] - '0';
            }
        }
        for (int i = result.length - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                baseArr[j] *= base;
            }
        }
        for (int i = 0; i < baseArr.length; i++) {
            output += result[i] * baseArr[i];
        }
        System.out.println(output);
    }
}
