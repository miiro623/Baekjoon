package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] wordArray = word.toCharArray();
        int num = Integer.parseInt(br.readLine());
        System.out.println(wordArray[num - 1]);
    }
}
