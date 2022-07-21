package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1316 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int ret = 0;
            List<Character> a = new ArrayList<>();

            while (n != 0) {
                String s = br.readLine();
                boolean isGroup = true;
                char prev = '\0';

                a.clear();
                
                for (char ch : s.toCharArray()) {
                    if (!a.contains(ch)) {
                        a.add(ch);
                    } else {
                        if (prev == ch) continue;
                        
                        isGroup = false;
                        break;
                    }

                    prev = ch;
                }

                if (isGroup) ++ret;
                n--;
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
