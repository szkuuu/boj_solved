package souzoudev.bojsolved.problem;

import java.io.*;

public class P1436 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            
            int ret = 666;
            int his = ret + 1;
            while (n > 1) {
                int sixCount = 0;
                int temp = his;

                while (temp != 0) {
                    // if (temp % 10 == 6) ++sixCount;
                    sixCount = temp % 10 == 6 ? sixCount + 1 : 0;
                    if (sixCount == 3) {
                        ret = his;
                        n--;
                        break;
                    }
                    temp /= 10;
                }

                his++;
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
