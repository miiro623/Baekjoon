package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] charWord = word.toCharArray();
        int [] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = - 1;
        }
        for (int i = charWord.length - 1; i >= 0; i--) {
            alphabet[charWord[i] - 'a'] = i;
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
