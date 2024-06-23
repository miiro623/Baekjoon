package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> str = new ArrayList<String>();
        char [] bracket = new char[100];
        int top = -1;
        ArrayList<String> check = new ArrayList<String>();

        int cnt = 0;
        check.add("yes");
        str.add(st.nextToken());
            while (true) {
                if (str.get(0).equals(".")) {
                    break;
                }
                if(str.get(str.size() - 1).contains("(")){
                    bracket[++top] = '(';
                }
                if (str.get(str.size() - 1).contains("[")) {
                    bracket[++top] = '[';
                }
                if (str.get(str.size() - 1).contains(")")) {
                    if(bracket[top] == '('){
                        check.add(cnt,"yes");
                        check.remove(cnt + 1);
                        top--;
                    }else {
                        check.add(cnt,"no");
                        check.remove(cnt + 1);
                    }
                }
                if (str.get(str.size() - 1).contains("]")) {
                    if(bracket[top] == '['){
                        check.add(cnt,"yes");
                        check.remove(cnt + 1);
                        top--;
                    }else {
                        check.add(cnt,"no");
                        check.remove(cnt + 1);
                    }
                }
                if(top != -1){
                    check.add(cnt,"no");
                    check.remove(cnt + 1);
                }

                if(str.get(str.size() - 1).contains(".")){
                    str.clear();
                    cnt++;
                    st = new StringTokenizer(br.readLine());
                    str.add(st.nextToken());
                }else {
                    str.add(st.nextToken());
                }
            }
        for (int i = 0; i < check.size(); i++) {
            System.out.println(check.get(i));
        }
    }
}