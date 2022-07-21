package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.Arrays;

public class P4673 {
    public static void solution(String[] args) {
        try (var bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            final int MAX = 10000;
            boolean[] isSelfNumbers = new boolean[MAX];
            Arrays.fill(isSelfNumbers, false);

            for (int i = 0; i < MAX; ++i) {
                if (isSelfNumbers[i]) continue;
                int temp = i + 1;

                while (true) {
                    temp = sn(temp);
                    if (temp > MAX) break;
                    isSelfNumbers[temp - 1] = true;
                }
            }

            for (int i = 0; i < MAX; ++i) {
                if (!isSelfNumbers[i]) {
                    bw.write(Integer.toString(i + 1));
                    bw.newLine();
                }
            }
        } catch (IOException e) {}
    }

    public static int sn(int start) {
        int temp = start;
        int ret = start;

        while (temp != 0) {
            ret += temp % 10;
            temp /= 10;
        }

        return ret;
    }
}
