package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2562 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = 9;
            var arr = new ArrayList<Integer>();

            while (n != 0) {
                int a = Integer.parseInt(br.readLine());
                arr.add(a);

                n--;
            }

            int max = arr.stream().max(Comparator.naturalOrder()).get();
            int idx = arr.indexOf(max) + 1;

            bw.write(Integer.toString(max) + '\n' + Integer.toString(idx));
        } catch (IOException e) {}
    }
}
