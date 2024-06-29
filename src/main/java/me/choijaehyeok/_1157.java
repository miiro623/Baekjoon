package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char [] str = br.readLine().toCharArray();
            int [] alphabet = new int[26];
            int max = 0;
            char result = 'a';
            for (int i = 0; i < str.length; i++) {
                if('A' <= str[i] && str[i] <= 'Z' ){
                    alphabet[str[i] - 'A']++;
                }else {
                    alphabet[str[i] - 'a']++;
                }
            }
            for (int i = 0; i < alphabet.length; i++) {
                if(alphabet[i] > max){
                    max = alphabet[i];
                }
            }
            for (int i = 0; i < alphabet.length; i++) {
                if(alphabet[i] == max ){
                    if (result != 'a'){
                        result = '?';
                    }else result = (char) ('A' + i );
                }
            }
        System.out.println(result);
    }
}
