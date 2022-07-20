package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class P10871 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk1 = new StringTokenizer(br.readLine());
            var arr = new ArrayList<Integer>();

            int _n = Integer.parseInt(tk1.nextToken());
            int cmp = Integer.parseInt(tk1.nextToken());

            var tk2 = new StringTokenizer(br.readLine());
            while (tk2.hasMoreTokens()) {
                int temp = Integer.parseInt(tk2.nextToken());
                if (temp < cmp) arr.add(temp);
            }

            bw.write(arr.stream().map(i -> Integer.toString(i) + " ").collect(Collectors.joining()).trim());
            bw.newLine();
        } catch (IOException e) {}
    }
}
