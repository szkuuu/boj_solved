package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10816 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Map<Integer, Integer> cards = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            var tkn = new StringTokenizer(br.readLine());

            while (tkn.hasMoreTokens()) {
                int cn = Integer.parseInt(tkn.nextToken());

                if (cards.containsKey(cn)) {
                    int cnv = cards.get(cn);
                    cards.remove(cn);
                    cards.put(cn, cnv + 1);
                } else {
                    cards.put(cn, 1);
                }
            }

            int m = Integer.parseInt(br.readLine());
            var tkm = new StringTokenizer(br.readLine());

            while (tkm.hasMoreTokens()) {
                sb.append(cards.getOrDefault(Integer.parseInt(tkm.nextToken()), 0)).append(' ');
            }

            bw.write(sb.toString().trim());
        } catch (IOException e) {}
    }
}
