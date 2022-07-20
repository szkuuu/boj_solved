package souzoudev.bojsolved.problem;

import java.io.*;

public class P10926 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            String str = br.readLine();
            
            bw.write(str + "??!");
        } catch (IOException e) {}
    }
}
