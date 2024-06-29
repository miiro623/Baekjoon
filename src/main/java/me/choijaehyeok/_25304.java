package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int price;
        int cnt;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            price = Integer.parseInt(st.nextToken());
            cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }
        if (sum == totalAmount) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
