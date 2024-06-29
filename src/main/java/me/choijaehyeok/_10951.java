package me.choijaehyeok;

import java.io.*;
import java.util.StringTokenizer;

public class _10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String check;

        while ((check = br.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(check," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
    }
}
