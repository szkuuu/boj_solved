package souzoudev.bojsolved.problem;

import java.io.*;

public class P9498 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int a = Integer.parseInt(br.readLine());
            
            String ret;
            if (a >= 90) {
                ret = "A";
            } else if (a >= 80) {
                ret = "B";
            } else if (a >= 70) {
                ret = "C";
            } else if (a >= 60) {
                ret = "D";
            } else {
                ret = "F";
            }
            
            bw.write(ret);
        } catch (IOException e) {}
    }
}
