package souzoudev.bojsolved.problem;

import java.io.*;

public class P2941 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String s = br.readLine();
            String cnv = s
                            .replace("c=", "K")
                            .replace("c-", "K")
                            .replace("dz=", "K")
                            .replace("d-", "K")
                            .replace("lj", "K")
                            .replace("nj", "K")
                            .replace("s=", "K")
                            .replace("z=", "K");

            bw.write(Integer.toString(cnv.length()));
        } catch (IOException e) {}
    }
}
