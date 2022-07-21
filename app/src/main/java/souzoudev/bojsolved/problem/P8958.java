package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class P8958 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            while (n != 0) {
                String str = br.readLine();
                var slice = str.split("X+");

                var ret = 
                    Arrays.stream(slice)
                        .map(s -> s.length())
                        .map(i -> IntStream.rangeClosed(1, i).sum())
                        .reduce(0, (o1, o2) -> o1 + o2);

                bw.write(Integer.toString(ret));
                bw.newLine();
                n--;
            }
        } catch (IOException e) {}
    }
}
