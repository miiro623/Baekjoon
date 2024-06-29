package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        char result;
        if (test >= 90) {
            result = 'A';
        }else if (test >= 80) {
            result = 'B';
        }else if (test >= 70) {
            result = 'C';
        }else if (test >= 60) {
            result = 'D';
        }else result = 'F';

        System.out.println(result);
    }
}
