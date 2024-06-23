package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        List<Integer> queue = new ArrayList<Integer>();
        List<Integer> output = new ArrayList<Integer>();
        int back = -1;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                back++;
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                if (back == -1) {
                    output.add(-1);
                }
                else{
                    output.add(queue.get(0));
                    queue.remove(0);
                    back--;
                }
            } else if (command.equals("size")) {
                output.add(back + 1);
            }
            else if (command.equals("empty")) {
                if (back == -1) {
                    output.add(1);
                }
                else {
                    output.add(0);
                }
            }
            else if (command.equals("front")) {
                if (back == -1) {
                    output.add(-1);
                }
                else{
                    output.add(queue.get(0));
                }
            }
            else if (command.equals("back")) {
                if (back == -1) {
                    output.add(-1);
                }
                else {
                    output.add(queue.get(back));
                }
            }
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
