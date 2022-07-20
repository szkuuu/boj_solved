package souzoudev.bojsolved.problem;

import java.io.*;

public class P2588 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int temp = b;
            
            while (b != 0) {
                bw.write(Integer.toString(a * (b % 10)));
                b /= 10;
                bw.newLine();
            }
            bw.write(Integer.toString(a * temp));
        } catch (IOException e) {}
    }
}
