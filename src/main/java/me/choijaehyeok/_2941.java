package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        char [] croatia;
        string += " ";
        croatia = string.toCharArray();
        int cnt = croatia.length - 1;

        for (int i = 1; i < croatia.length; i++) {

            if (croatia[i - 1] == 'd' && croatia[i] == 'z' && croatia[i + 1] == '=') {
                cnt--;
            }
            else if(croatia[i-1] == 'l' && croatia[i] == 'j') {
                cnt--;
            }
            else if(croatia[i-1] == 'n' && croatia[i] == 'j') {
                cnt--;
            }

            if (croatia[i] == '-' || croatia[i] == '=') {
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
