package souzoudev.bojsolved.problem;

import java.io.*;

public class P10718 {
    public static void solution(String[] args) {
        try (var bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("강한친구 대한육군");
            bw.newLine();
            bw.write("강한친구 대한육군");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
