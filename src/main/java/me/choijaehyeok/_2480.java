package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fDice = Integer.parseInt(st.nextToken());
        int sDice = Integer.parseInt(st.nextToken());
        int tDice = Integer.parseInt(st.nextToken());
        int price = 0;


        if (fDice == sDice && tDice == sDice){
            price = 10000 + fDice * 1000;
        }else if (fDice == sDice){
            price = 1000 + fDice * 100;
        }else if (sDice == tDice){
            price = 1000 + sDice * 100;

        }else if (fDice == tDice) {
            price = 1000 + fDice * 100;
        }else {
            if(fDice > sDice){
                if (fDice > tDice){
                    price = fDice * 100;
                }else {
                    price = tDice * 100;
                }
            }else {
                if (sDice > tDice){
                    price = sDice * 100;
                }else {
                    price = tDice * 100;
                }
            }
        }
        System.out.println(price);
    }
}
