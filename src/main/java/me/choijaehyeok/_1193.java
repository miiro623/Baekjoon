package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num;
        num = Integer.parseInt(st.nextToken());

        int arrCnt = 1;
        int arrSum = 0;


        while (true) {

            if (num <= arrSum + arrCnt) {
                if (arrCnt % 2 == 1) {
                    System.out.println((arrCnt - (num - arrSum - 1) + "/" + (num - arrSum)));
                } else {
                    System.out.println((num - arrSum) + "/" + (arrCnt  - (num - arrSum - 1)));
                }
                break;
            } else {
                arrSum += arrCnt;
                arrCnt++;
            }

        }
    }
}
