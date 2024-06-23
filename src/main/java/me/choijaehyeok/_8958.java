package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String quiz;
        char [] oxarr;
        int cnt = 0;
        int [] point = new int[num];

        for (int i = 0; i < num; i++) {
            quiz = br.readLine();
            oxarr = quiz.toCharArray();
            for (int j = 0; j < oxarr.length; j++) {
                if (oxarr[j] == 'O') {
                    cnt++;
                    point[i] += cnt;
                }
                else if (oxarr[j] == 'X') {
                    cnt = 0;
                }
            }
            cnt = 0;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(point[i]);
        }
    }
}
