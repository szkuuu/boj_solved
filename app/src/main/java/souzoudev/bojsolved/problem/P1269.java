package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1269 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Set<Integer> aFirst = new HashSet<>();
            Set<Integer> bFirst = new HashSet<>();

            var trash = br.readLine();
            var tka = new StringTokenizer(br.readLine());
            var tkb = new StringTokenizer(br.readLine());

            while (tka.hasMoreTokens()) aFirst.add(Integer.parseInt(tka.nextToken()));
            while (tkb.hasMoreTokens()) bFirst.add(Integer.parseInt(tkb.nextToken()));

            var aSecond = new HashSet<Integer>();
            var bSecond = new HashSet<Integer>();

            aSecond.addAll(aFirst);
            bSecond.addAll(bFirst);

            aFirst.removeAll(bFirst);
            bSecond.removeAll(aSecond);

            bw.write(Integer.toString(aFirst.size() + bSecond.size()));
        } catch (IOException e) {}
    }
}
