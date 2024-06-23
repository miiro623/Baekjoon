package me.choijaehyeok;

import java.util.Scanner;

public class _1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int [] status = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            status[i] = sc.nextInt();
        }
        int student = sc.nextInt();
        int [][] receivedNum = new int[student][2];
        for (int i = 0; i < student; i++) {
            receivedNum[i][0] = sc.nextInt();
            receivedNum[i][1] = sc.nextInt();
        }

        for (int i = 0; i < student; i++) {
            if (receivedNum[i][0] == 1) {
                for (int j = 0; j < cnt; j++) {
                    if((j+1) % receivedNum[i][1] == 0){
                        if(status[j] == 1) status[j] = 0;
                        else status[j] = 1;
                    }
                }
            }
            else {
                if(status[receivedNum[i][1] - 1] == 0) status[receivedNum[i][1] - 1] = 1;
                    else status[receivedNum[i][1] - 1] = 0;

                for(int j = 1; j < cnt / 2; j++) {
                    if(receivedNum[i][1] - 1 + j >= cnt || receivedNum[i][1] - 1 - j < 0)
                        break;//대칭일때 배열의 중간 값의 양 옆의 개수는 배열의 최대길이의 절반 값이 최대이다.
                    if(status[receivedNum[i][1] - 1 - j] == status[receivedNum[i][1] - 1 + j]) {
                        if(status[receivedNum[i][1] - 1 - j] == 0) {
                            status[receivedNum[i][1] - 1 - j] = 1;
                            status[receivedNum[i][1] - 1 + j] = 1;
                        }
                        else {
                            status[receivedNum[i][1] - 1 - j] = 0;
                            status[receivedNum[i][1] - 1 + j] = 0;
                        }
                    }
                    else break;
                }
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(status[i] + " ");
            if((i+1)%20 == 0) System.out.println();
        }
    }
}

