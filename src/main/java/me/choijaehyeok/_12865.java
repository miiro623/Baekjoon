package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class _12865 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num, weight;
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        weight = Integer.parseInt(st.nextToken());


        int [][] arr;
        int [][] bag;
        arr = new int [num + 1][2];
        bag = new int[num + 1][weight + 1];

        for (int i = 1; i <= num; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            arr [i][0] = Integer.parseInt((st1.nextToken()));
            arr [i][1] = Integer.parseInt((st1.nextToken()));
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= weight; j++){
                bag[i][j] = bag[i-1][j];
                if(j >= arr[i][0])
                    bag[i][j] = Math.max(bag[i][j], bag[i-1][j-arr[i][0]]+arr[i][1]);
            }
        }
        System.out.println(bag[num][weight]);
    }

}