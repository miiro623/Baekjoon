package me.choijaehyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double gpa = 0;
        double gradeSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String score = st.nextToken();


            switch (score) {
                case "A+":
                    gpa += grade * 4.5;
                    break;
                case "A0":
                    gpa += grade * 4.0;
                    break;
                case "B+":
                    gpa += grade * 3.5;
                    break;
                case "B0":
                    gpa += grade * 3.0;
                    break;
                case "C+":
                    gpa += grade * 2.5;
                    break;
                case "C0":
                    gpa += grade * 2.0;
                    break;
                case "D+":
                    gpa += grade * 1.5;
                    break;
                case "D0":
                    gpa += grade;
                    break;
                case "F":
                    gpa += 0;
                    break;
                default:
                    break;
            }
            if(!score.equals("P")) {
                gradeSum += grade;
            }
        }
        gpa /= gradeSum;
        System.out.printf("%.6f", gpa);
    }
}
