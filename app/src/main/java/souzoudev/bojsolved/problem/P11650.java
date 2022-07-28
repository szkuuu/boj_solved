package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P11650 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
                int n = Integer.parseInt(br.readLine());
                int[][] a = new int[n][2];
                StringBuilder sb = new StringBuilder();

                while (n > 0) {
                    var tk = new StringTokenizer(br.readLine());
                    
                    int x = Integer.parseInt(tk.nextToken());
                    int y = Integer.parseInt(tk.nextToken());

                    a[n - 1][0] = x;
                    a[n - 1][1] = y;

                    n--;
                }

                Arrays.stream(a)
                    .sorted((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0])
                    .forEach(arr -> sb.append(arr[0]).append(' ').append(arr[1]).append('\n'));

                bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
