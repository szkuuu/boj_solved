package souzoudev.bojsolved.problem;

import java.io.*;

public class P2581 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            int i = a;
            int min = -1;
            int sum = 0;
            while (i <= b) {
                if (isQ(i)) {
                    min = min == -1 ? i : min;
                    sum += i;
                }
                i++;
            }

            if (min == -1) {
                bw.write(Integer.toString(-1));
            } else {
                bw.write(Integer.toString(sum));
                bw.newLine();
                bw.write(Integer.toString(min));
            }
        } catch (IOException e) {}
    }

    public static boolean isQ(int n, int d) {
        if (n == 1) return false;
        if (Math.round(Math.sqrt(n)) < d) return true;

        return n % d == 0 ? false : isQ(n, d + 1);
    }

    public static boolean isQ(int n) {
        return isQ(n, 2);
    }
}
