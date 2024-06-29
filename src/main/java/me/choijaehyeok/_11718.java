package me.choijaehyeok;

import java.io.*;

public class _11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        String check;
        int cnt = 0;
        while (cnt < 100) {
            input = br.readLine();
            if (input == null || input.equals("")) break;

            bw.write(input +"\n");
            cnt++;
        }
        bw.flush();
        bw.close();
    }
}
