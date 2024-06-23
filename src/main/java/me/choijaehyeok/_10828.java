package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _10828 {
    static int top = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int [] stack = new int[num];
        List<Integer> output = new ArrayList<Integer>();


        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int push = Integer.parseInt(st.nextToken());
                stack[++top] = push;
            } else if (command.equals("pop")) {
                if (top == -1) {
                    output.add(-1);
                } else {
                    output.add(stack[top--]);
                }
            } else if (command.equals("size")) {
                output.add(top + 1);
            } else if (command.equals("empty")) {
                if (top == -1) {
                    output.add(1);
                } else {
                    output.add(0);
                }
            } else if (command.equals("top")) {
                if (top == -1) {
                    output.add(-1);
                } else {
                    output.add(stack[top]);
                }
            }
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
