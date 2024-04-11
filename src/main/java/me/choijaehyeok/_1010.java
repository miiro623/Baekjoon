package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1010 {
    static int [][] bridge;

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());

        int[][] sites;
        sites = new int[num][2];
        bridge = new int[30][30];

        for (int i = 0; i < num; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            sites[i][0] = Integer.parseInt(st1.nextToken());
            sites[i][1] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < num; i++) {
            combination(sites[i][0], sites[i][1]);
            System.out.println(bridge[sites[i][0]][sites[i][1]]);
        }
    }
    static int combination(int west, int east) {
        if(bridge[west][east] > 0){
            return bridge[west][east];
        }

        if (west == east || east == 0){
            return bridge[west][east] = 1;
        }
        if (west == 1){
            return bridge[west][east] = east;
        }
        return bridge[west][east] = combination(west,east - 1) + combination(west - 1,east -1);
    }


}
