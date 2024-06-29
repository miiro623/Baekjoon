package me.choijaehyeok;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> result = new ArrayList<Character>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
            result.add(ch[0]);
            result.add(ch[ch.length - 1]);
        }
        for (int i = 0; i < result.size(); i+=2) {
            System.out.print(result.get(i));
            System.out.println(result.get(i+1));
        }
    }
}
