package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] scale = new int[8];
        boolean valid = true;
        boolean valid2 = true;
        for (int i = 0; i < 8; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 8; i++){
            if(scale[i] != i + 1){
                valid = false;
                break;
            }
        }
        if(valid){
            System.out.println("ascending");
        }
        for (int i = 0; i < 8; i++){
            if(scale[i] != 8 - i){
                valid2 = false;
                break;
            }
        }
        if(valid2){
            System.out.println("descending");
        }
        if (!valid && !valid2){
            System.out.println("mixed");
        }

    }
}
