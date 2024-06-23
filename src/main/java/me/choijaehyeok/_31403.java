package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());
        int intResult = 0;
        int strResult = 0;

        intResult = first + second - third;
        if(second == 1000){
            strResult = first * 10000 + second - third;
        }
        else if(second / 100 > 0){
            strResult = first * 1000 + second - third;
        }
        else if(second / 10 > 0){
            strResult = first * 100 + second - third;
        }
        else strResult = first * 10 + second - third;
        System.out.println(intResult);
        System.out.println(strResult);
    }
}
