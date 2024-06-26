package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String [][] jersey = new String[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            jersey[i][0] = st.nextToken();
            jersey[i][1] = st.nextToken();
        }
        Arrays.sort(jersey , (o1, o2) -> {
            if(Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
                return 0;
            } else if(Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
                return -1;
            } else
                return 1;
        });

        for (int i = 0; i < num; i++) {
            System.out.print(jersey[i][0] + " ");
            System.out.println(jersey[i][1]);
        }
    }
}
