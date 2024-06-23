package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int afternoon = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int stickHeight = Integer.parseInt(st.nextToken());
        int day = (stickHeight - night) / (afternoon - night);
        if ((stickHeight - night) % (afternoon - night) != 0){
            System.out.println(day + 1);
        }
        else {
            System.out.println(day);
        }
    }
}
