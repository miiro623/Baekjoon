package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int [][] xy = new int[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xy , (xy1, xy2) -> {
            if(xy1[0] == xy2[0]) {
                return xy1[1] - xy2[1];
            } else {
                return xy1[0] - xy2[0];
            }
        });
        for (int i = 0; i < num; i++) {
            System.out.print(xy[i][0] + " ");
            System.out.println(xy[i][1]);
        }
    }
}
