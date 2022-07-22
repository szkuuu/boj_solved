package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;

public class P2775 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int t = Integer.parseInt(br.readLine());

            while (t != 0) {
                int k = Integer.parseInt(br.readLine());
                int n = Integer.parseInt(br.readLine());

                t--;
                bw.write(Integer.toString(Q(k, n)));
                bw.newLine();
            }
        } catch (IOException e) {}
    }

    public static int Q(int o1, int o2) {
        if (o1 == 1) {
            int temp = 0;

            while (o2 > 0) {
                temp += o2;
                --o2;
            }

            return temp;
        }
        
        if (o2 == 1) return 1;

        return Q(o1, o2 - 1) + Q(o1 - 1, o2);
    }
}
