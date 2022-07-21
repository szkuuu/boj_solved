package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.Arrays;

public class P2577 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            int[] digit = new int[10];
            Arrays.fill(digit, 0);

            int r = a * b * c;
            while (r != 0) {
                digit[r % 10]++;
                r /= 10;
            }

            Arrays.stream(digit).boxed().forEach(i -> {
                try {
                    bw.write(Integer.toString(i));
                    bw.newLine();
                } catch (Exception ignored) {}
            });
        } catch (IOException e) {}
    }
}
