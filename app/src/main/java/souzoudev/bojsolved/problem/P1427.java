package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1427 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[10];
            StringBuilder sb = new StringBuilder("0");
            
            if (n != 0) sb.setLength(0);
            
            while (n != 0) {
                ++a[n % 10];
                n /= 10;
            }
            
            for (int i = 9; i >= 0; --i) {
                for (int j = a[i]; j > 0; --j) {
                    sb.append(i);
                }
            }
            
            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
