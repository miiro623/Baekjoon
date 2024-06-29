package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] student = new int[30];
        int attendance;
        for (int i = 0; i < 28; i++) {
            attendance = Integer.parseInt(br.readLine());
            student[attendance - 1]++;
        }
        for (int i = 0; i < 30; i++) {
            if (student[i] == 0){
                System.out.println(i + 1);
            }
        }
    }
}
