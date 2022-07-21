package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P11720 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            var str = br.readLine();

            int acc = 0;
            for (char ch : str.toCharArray()) {
                acc += (int) ch - '0';
            }

            bw.write(Integer.toString(acc));
        } catch (IOException e) {}
    }
}
