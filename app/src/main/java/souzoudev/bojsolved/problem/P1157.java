package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class P1157 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String s = br.readLine().toLowerCase();
            int[] arr = new int[26];

            s.chars().boxed().forEach(i -> {
                ++arr[i % 'a'];
            });

            int max = Arrays.stream(arr).max().orElse(0);
            boolean single = Arrays.stream(arr).filter(i -> i == max).count() == 1;

            if (!single) {
                bw.write("?");
            } else {
                for (int idx = 0; idx < arr.length; ++idx) {
                    if (arr[idx] == max) {
                        char ch = (char) (idx + 'a');
                        bw.write(Character.toUpperCase(ch));
                    }
                }
            }
        } catch (IOException e) {}
    }
}
