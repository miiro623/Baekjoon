package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palindrome = br.readLine();
        char [] palindromeArr = palindrome.toCharArray();

        int left = 0;
        int right = palindromeArr.length - 1;
        int result = 1;

        while (left < right) {
            if (palindromeArr[left] == palindromeArr[right]) {
                result = 1;
                left++;
                right--;
            }
            else {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
