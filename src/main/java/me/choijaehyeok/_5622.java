package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        char [] dialArray = dial.toCharArray();
        int time = 0;
        for (int i = 0; i < dialArray.length; i++) {
            if (dialArray[i] <= 'C') {
                time += 3;
            }else if (dialArray[i] <= 'F') {
                time += 4;
            }else if (dialArray[i] <= 'I') {
                time += 5;
            }else if (dialArray[i] <= 'L') {
                time += 6;
            }else if (dialArray[i] <= 'O') {
                time += 7;
            }else if (dialArray[i] <= 'S') {
                time += 8;
            }else if (dialArray[i] <= 'V') {
                time += 9;
            }else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
