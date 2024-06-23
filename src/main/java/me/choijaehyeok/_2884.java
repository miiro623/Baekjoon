package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int temp = 0;
        if (min >= 45){
            min -= 45;
        }
        else if (hour > 0){
            temp = 45 - min;
            min = 60 - temp;
            hour--;
        }
        else{
            temp = 45 - min;
            min = 60 - temp;
            hour = 23;
        }
        System.out.print(hour + " ");
        System.out.print(min);

    }
}
