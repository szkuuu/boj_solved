package souzoudev.bojsolved.problem;

import java.io.*;

public class P10171 {
    public static void solution(String[] args) {
        try (var bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("\\    /\\");
            bw.newLine();
            bw.write(" )  ( ')");
            bw.newLine();
            bw.write("(  /  )");
            bw.newLine();
            bw.write(" \\(__)|");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
