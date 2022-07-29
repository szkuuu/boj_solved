package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P11478 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Set<String> history = new HashSet<>();
            String str = br.readLine();
            int strLength = str.length();

            for (int interval = 1; interval <= strLength; ++interval) {
                for (int start = 0, end = start + interval; end <= strLength; ++start, ++end) {
                    history.add(str.substring(start, end));
                }
            }

            bw.write(Integer.toString(history.size()));
        } catch (IOException e) {}
    }
}
