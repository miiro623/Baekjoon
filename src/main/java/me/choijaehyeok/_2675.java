package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int repeat;
        String str;
        char [] chars;
        String result = "";

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            repeat = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            chars = str.toCharArray();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    result += chars[j];
                }
            }
            result += "\n";
        }

        System.out.println(result);

    }
}
