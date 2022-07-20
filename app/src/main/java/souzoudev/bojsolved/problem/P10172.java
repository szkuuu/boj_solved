package souzoudev.bojsolved.problem;

import java.io.*;

public class P10172 {
    public static void solution(String[] args) {
        try (var bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("|\\_/|"); bw.newLine();
            bw.write("|q p|   /}"); bw.newLine();
            bw.write("( 0 )\"\"\"\\"); bw.newLine();
            bw.write("|\"^\"`    |"); bw.newLine();
            bw.write("||_/=\\\\__|");
        } catch (IOException e) {}
    }
}
