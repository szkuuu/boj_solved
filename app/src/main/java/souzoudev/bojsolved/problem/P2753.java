package souzoudev.bojsolved.problem;

import java.io.*;

public class P2753 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int year = Integer.parseInt(br.readLine());
            
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                bw.write(Integer.toString(1));
            } else {
                bw.write(Integer.toString(0));
            }
        } catch (IOException e) {}
    }
}
