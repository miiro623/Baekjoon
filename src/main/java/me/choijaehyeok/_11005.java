package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int base = Integer.parseInt(st.nextToken());
        int baseNum = Integer.parseInt(st.nextToken());
        List<Integer> result = new ArrayList<Integer>();
        while (base / baseNum > 0) {
            result.add(base % baseNum);
            base = base / baseNum;

        }
        result.add(base);
        char [] val = new char[result.size()];
        for (int i = result.size() -1; i >= 0; i--) {
            if (result.get(i) >= 10) {
                val[i] = (char) (result.get(i) - 10 +'A');
            }else val[i] = (char) (result.get(i) + '0');
        }
        for (int i = val.length - 1; i >= 0; i--) {
            System.out.print(val[i]);
        }
    }
}