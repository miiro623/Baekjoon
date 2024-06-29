package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int [] arr = new int[num];
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int findNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            if (arr[i] == findNum) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
