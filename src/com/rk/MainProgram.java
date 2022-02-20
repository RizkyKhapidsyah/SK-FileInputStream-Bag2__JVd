package com.rk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

/*
    Source by Saurabh Kumar Prajapati, Hosted by GeeksForGeeks
    Modified For Learn by RK
    I.D.E : JB Intellij Idea 2019
*/

public class MainProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        pw.flush();
    }
}
