package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num;
        num = Integer.parseInt(st.nextToken());

        String [] word;
        word = new String[num];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++){
            word[i] = st1.nextToken();
        }
       /* for (int i = 0; i < num; i++){
            if ()
        }*/
    }
}
