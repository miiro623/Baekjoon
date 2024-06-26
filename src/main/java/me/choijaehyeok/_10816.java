package me.choijaehyeok;

import java.io.*;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int [] numArr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        int resultNum = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < resultNum; i++) {
            int cnt = 0;
            int result = Integer.parseInt(st.nextToken());
            for(int j = 0; j < num; j++){
                if(result == numArr[j]){
                    cnt++;
                }
            }
            bw.write(cnt + " ");
        }
        br.close();
       bw.flush();
        bw.close();
    }
}

