package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.StringTokenizer;

public class P2908 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());

            int ra = Integer.parseInt(reverseNumber(a));
            int rb = Integer.parseInt(reverseNumber(b));

            bw.write(ra < rb ? Integer.toString(rb) : Integer.toString(ra));
        } catch (IOException e) {}
    }

    public static String reverseNumber(int number, String acc) {
        if (number == 0) return acc;

        acc += Integer.toString(number % 10);

        return reverseNumber(number / 10, acc);
    }

    public static String reverseNumber(int number) {
        return reverseNumber(number, "");
    }
}
