package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cook = Integer.parseInt(st.nextToken());

        hour += cook / 60;
        min += cook % 60;

        if (min > 59) {
            hour += 1;
            min -= 60;
        }
        if (hour > 23) {
            hour -= 24;
        }

        System.out.print(hour + " " + min);
    }
}
