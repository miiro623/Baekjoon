package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;
        num = Integer.parseInt(br.readLine());
        String word;
        int cnt = num;

        for (int i = 0; i < num; i++){
            word = br.readLine();
            char[] ch = word.toCharArray();
            List<Character> checker = new ArrayList<Character>();
            for (int j = 1; j < ch.length; j++){
                if (ch[j] != ch[j-1]){
                    checker.add(ch[j-1]);
                }
                if(checker.contains(ch[j])){
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
