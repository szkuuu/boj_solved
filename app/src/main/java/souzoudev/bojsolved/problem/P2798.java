package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2798 {
    private static int MIN = 300000;
    private static int SUM = 0;

    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(tk.nextToken());
            int target = Integer.parseInt(tk.nextToken());
            List<Integer> cards = new ArrayList<>();

            var cardTk = new StringTokenizer(br.readLine());

            while (cardTk.hasMoreTokens()) {
                cards.add(Integer.parseInt(cardTk.nextToken()));
            }

            for (int i = 0; i < cards.size() - 2; ++i) {
                for (int j = i + 1; j < cards.size() - 1; ++j) {
                    for (int k = j + 1; k < cards.size(); ++k) {
                        int sum = (cards.get(i) + cards.get(j) + cards.get(k));
                        int interval = target - sum;

                        if (interval < 0) continue;
                        
                        if (MIN > interval) {
                            MIN = interval;
                            SUM = sum;
                        }
                    }
                }
            }

            bw.write(Integer.toString(SUM));
        } catch (IOException e) {}
    }
}
