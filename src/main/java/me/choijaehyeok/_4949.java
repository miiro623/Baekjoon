package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = new char[100];
        char [] bracket = new char[100];
        int top = -1;
        ArrayList<String> check = new ArrayList<String>();

        int cnt = 0;
        check.add("yes");
        str = (br.readLine()).toCharArray();

            while (true) {
                if (str[0] == ('.')) {
                    break;
                }
                for (int i = 0; i < str.length; i++) {
                    if(str[i] == ('(')) {
                        bracket[++top] = '(';
                    }if (str[i] == ('[')) {
                        bracket[++top] = '[';
                    }
                    if (str[i] == (')')) {
                        if(bracket[top] == '('){
                            check.set(cnt,"yes");
                            top--;
                        }else {
                            check.set(cnt,"no");
                        }
                    }
                    if (str[i] == (']')) {
                        if(bracket[top] == '['){
                            check.set(cnt,"yes");
                            top--;
                        }else {
                            check.set(cnt,"no");
                        }
                    }
                    if(top != -1){
                        check.set(cnt,"no");
                    }

                    if(str[i] == ('.')){
                        str = new char[100];
                        cnt++;
                        str = br.readLine().toCharArray();
                    }

                }
            }
        for (int i = 0; i < check.size(); i++) {
            System.out.println(check.get(i));
        }
    }
}