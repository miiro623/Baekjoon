package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int height;
        int width;
        int guest;
        int [] result = new int[num];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            guest = Integer.parseInt(st.nextToken());
            if (guest % height == 0){
                result[i] = height * 100 + (guest / height);
            }
            else result[i] = (guest % height)*100 + (guest / height + 1);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
        }
    }
}


