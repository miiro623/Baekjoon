package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double [] subject = new double[num];
        double max = 0;
        double avg = 0;
        for (int i = 0; i < num; i++) {
            subject[i] = Integer.parseInt(st.nextToken());
            if (max < subject[i]) {
                max = subject[i];
            }
        }
        for (int i = 0; i < num; i++) {
            subject[i] = subject[i] / max * 100;
            avg += subject[i];

        }

        avg /= num;
        System.out.println(avg);
    }
}
