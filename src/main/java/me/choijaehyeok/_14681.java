package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int quadrant = 0;

        if (x > 0 && y > 0) {
            quadrant = 1;
        }else if (x > 0 && y < 0) {
            quadrant = 4;
        }else if (x < 0 && y > 0) {
            quadrant = 2;
        }else if (x < 0 && y < 0) {
            quadrant = 3;
        }

        System.out.println(quadrant);
    }
}
