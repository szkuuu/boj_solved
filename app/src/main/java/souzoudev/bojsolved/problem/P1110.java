package souzoudev.bojsolved.problem;

import java.io.*;

public class P1110 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());
            int cycle = 0;
            int temp = a;

            do {
                int i0 = temp / 10;
                int i1 = temp % 10;
                int sum = i0 + i1;
                temp = (i1 * 10) + (sum % 10);
                cycle++;
            } while (a != temp);

            bw.write(Integer.toString(cycle)); bw.newLine();
        } catch (IOException e) {}
    }
}
