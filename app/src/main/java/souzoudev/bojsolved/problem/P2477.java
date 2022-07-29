package souzoudev.bojsolved.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2477 {
    public static int[] Rotate0 = { 4, 2, 3, 1, 3, 1 };
    public static int[] Rotate1 = { 4, 2, 3, 1, 4, 1 };
    public static int[] Rotate2 = { 4, 2, 4, 2, 3, 1 };
    public static int[] Rotate3 = { 4, 2, 3, 2, 3, 1 };

    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[6][2];

            for (int i = 0; i < 6; ++i) {
                var tk = new StringTokenizer(br.readLine());

                int go = Integer.parseInt(tk.nextToken());
                int len = Integer.parseInt(tk.nextToken());

                a[i][0] = go;
                a[i][1] = len;
            }

            outer: for (int start = 0, end = start + 6; start < 6; ++start, ++end) {
                boolean isRotate0 = true;
                boolean isRotate1 = true;
                boolean isRotate2 = true;
                boolean isRotate3 = true;

                for (int i = start, j = 0; i < end || j < 6; ++i, ++j) {
                    isRotate0 &= (a[i % 6][0] == Rotate0[j]);
                    isRotate1 &= (a[i % 6][0] == Rotate1[j]);
                    isRotate2 &= (a[i % 6][0] == Rotate2[j]);
                    isRotate3 &= (a[i % 6][0] == Rotate3[j]);

                    if (!(isRotate0 || isRotate1 || isRotate2 || isRotate3)) continue outer;
                }

                int big = 0;
                int small = 0;

                if (isRotate0) {
                    big = a[(start + 0) % 6][1] * a[(start + 1) % 6][1];
                    small = a[(start + 3) % 6][1] * a[(start + 4) % 6][1];
                } else if (isRotate1) {
                    big = a[(start + 1) % 6][1] * a[(start + 2) % 6][1];
                    small = a[(start + 4) % 6][1] * a[(start + 5) % 6][1];
                } else if (isRotate2) {
                    big = a[(start + 4) % 6][1] * a[(start + 5) % 6][1];
                    small = a[(start + 1) % 6][1] * a[(start + 2) % 6][1];
                } else if (isRotate3) {
                    big = a[(start + 0) % 6][1] * a[(start + 5) % 6][1];
                    small = a[(start + 2) % 6][1] * a[(start + 3) % 6][1];
                }

                bw.write(Integer.toString((big - small) * n));
                break;
            }
        } catch (IOException e) {}
    }
}
