package me.choijaehyeok;

import java.util.Scanner;

public class _12891 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int p = sc.nextInt();
    String dna = sc.next();
    char [] dnaArray = new char[s];
    dnaArray = dna.toCharArray();



    int [] ACGT = new int[4];
    int [] myACGT = new int[4];
    boolean valid = true;

    for (int i = 0; i < 4; i++) {
        ACGT[i] = sc.nextInt();

    }

    int password = 0;

    for (int i = 0; i < p; i++) {
        if (dnaArray[i] == 'A') myACGT[0]++;
        if (dnaArray[i] == 'C') myACGT[1]++;
        if (dnaArray[i] == 'G') myACGT[2]++;
        if (dnaArray[i] == 'T') myACGT[3]++;
    }

    for (int k = 0; k < 4; k++) {
        if (myACGT[k] < ACGT[k]) {
            valid = false;
            break;
        }
    }
    if (valid) {
        password++;
    }

    for (int i = p; i < s; i++) {
        int j = i - p;
        if (dnaArray[j] == 'A') myACGT[0]--;
        if (dnaArray[j] == 'C') myACGT[1]--;
        if (dnaArray[j] == 'G') myACGT[2]--;
        if (dnaArray[j] == 'T') myACGT[3]--;

        if (dnaArray[i] == 'A') myACGT[0]++;
        if (dnaArray[i] == 'C') myACGT[1]++;
        if (dnaArray[i] == 'G') myACGT[2]++;
        if (dnaArray[i] == 'T') myACGT[3]++;

        valid = true;
        for (int k = 0; k < 4; k++) {
            if (myACGT[k] < ACGT[k]) {
                valid = false;
                break;
            }
        }
        if (valid) {
            password++;
        }
    }

    System.out.println(password);

    }


}
