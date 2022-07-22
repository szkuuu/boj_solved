package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10757 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            String big1 = tk.nextToken();
            String big2 = tk.nextToken();
            var sb = new StringBuilder();
            int um = 0;

            String bigger = big1.length() > big2.length() ? big1 : big2;
            String smaller = bigger == big1 ? big2 : big1;

            bigger = new StringBuilder(bigger).reverse().toString();
            smaller = new StringBuilder(smaller).reverse().toString();

            int idx = 0;
            for (char ch : bigger.toCharArray()) {
                try {
                    int sum = (ch - '0') + (smaller.charAt(idx) - '0') + um;
                    um = sum / 10;

                    sb.append(sum % 10);
                } catch (Exception e) {
                    int sum = (ch - '0') + um;
                    um = sum / 10;

                    sb.append(sum % 10);
                } finally {
                    idx++;
                }
            }
            if (um == 1) sb.append(1);

            bw.write(sb.reverse().toString());
        } catch (IOException e) {}
    }
}
