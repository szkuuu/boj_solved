package souzoudev.bojsolved.problem;

import java.io.*;

public class P2108 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] plus = new int[4001];
            int[] minus = new int[4001];

            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int ret0 = Integer.MIN_VALUE;
            int ret1 = Integer.MIN_VALUE;
            int ret2 = Integer.MIN_VALUE;
            int ret3 = Integer.MIN_VALUE;

            for (int i = n; i > 0; --i) {
                int item = Integer.parseInt(br.readLine());
                sum += item;
                min = min > item ? item : min;
                max = max < item ? item : max;

                if (item >= 0) {
                    ++plus[item];
                } else {
                    ++minus[-item];
                }
            }

            ret0 = (int) Math.round(sum / (double) n);
            ret3 = max - min;

            int center = n / 2 + 1;
            int findCenter = 0;
            int findCount = 0;
            int tempCount = 0;
            int countMax = Integer.MIN_VALUE;

            if (center == 0) {
                ret1 = ret0;
                ret2 = ret0;
            } else {
                for (var i : minus) countMax = countMax < i ? i : countMax;
                for (var i : plus) countMax = countMax < i ? i : countMax;

                for (int i = 4000; i > 0; --i) {
                    if (minus[i] > 0) findCenter += minus[i];
                    if (minus[i] == countMax) {
                        findCount++;
                        tempCount = -i;
                    }

                    if (findCenter >= center) ret1 = ret1 == Integer.MIN_VALUE ? -i : ret1;
                    if (findCount == 2) ret2 = ret2 == Integer.MIN_VALUE ? -i : ret2;
                }

                for (int i = 0; i < 4001; ++i) {
                    if (plus[i] > 0) findCenter += plus[i];
                    if (plus[i] == countMax) {
                        findCount++;
                        tempCount = i;
                    }

                    if (findCenter >= center) ret1 = ret1 == Integer.MIN_VALUE ? i : ret1;
                    if (findCount == 2) ret2 = ret2 == Integer.MIN_VALUE ? i : ret2;
                }
            }

            if (ret2 == Integer.MIN_VALUE) ret2 = tempCount;

            bw.write(Integer.toString(ret0));
            bw.newLine();
            bw.write(Integer.toString(ret1));
            bw.newLine();
            bw.write(Integer.toString(ret2));
            bw.newLine();
            bw.write(Integer.toString(ret3));
        } catch (IOException e) {}
    }
}
