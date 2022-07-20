package souzoudev.bojsolved.problem;

import java.io.*;

public class P14681 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int p1 = Integer.parseInt(br.readLine());
            int p2 = Integer.parseInt(br.readLine());
            
            // xGreaterThanZero
            boolean xg = p1 > 0;
            // yGreaterThanZero
            boolean yg = p2 > 0;
            
            if (xg && yg) bw.write("1");
            if (!xg && yg) bw.write("2");
            if (!xg && !yg) bw.write("3");
            if (xg && !yg) bw.write("4");
        } catch (IOException e) {}
    }
}
