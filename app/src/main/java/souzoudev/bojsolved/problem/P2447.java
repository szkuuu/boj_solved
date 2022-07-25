package souzoudev.bojsolved.problem;

import java.io.*;

public class P2447 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            
            bw.write(Q(n));
        } catch (IOException e) {}
    }

    public static String Q(int n, int w, int h, StringBuilder sb) {
        if (n == 3) {
            return sb.append("***\n").append("* *\n").append("***").toString();
        }

        final int centerSize = n / 3;
        final int sectorSize = centerSize;
        final int coverSize = centerSize / 3;
        final int nextSector = h + sectorSize;

        while (h < nextSector) {
            if (w == n) {
                sb.append('\n');
                w = 0;
                ++h;

                continue;
            }

            final boolean isCover = ((w / coverSize) % coverSize == 1) && ((h / coverSize) % coverSize == 1);
            final boolean isCenter = ((w / centerSize) % centerSize == 1) && ((h / centerSize) % centerSize == 1);
    
            if (h % 3 == 0 || h % 3 == 2) {
                sb.append(isCover || isCenter ? " " : "*");
            } else {
                sb.append(isCover || isCenter || w % 3 == 1 ? " " : "*");
            }

            ++w;
        }

        if (h == n) return sb.toString();

        return Q(n, w, h, sb);
    }

    public static String Q(int n) {
        return Q(n, 0, 0, new StringBuilder());
    }
}
