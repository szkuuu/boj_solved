package souzoudev.bojsolved.problem;

import java.io.*;

public class P18108 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int year = Integer.parseInt(br.readLine());
            
            bw.write(Integer.toString(year - 543));
        } catch (IOException e) {}
    }
}
