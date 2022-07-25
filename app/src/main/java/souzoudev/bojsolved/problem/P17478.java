package souzoudev.bojsolved.problem;

import java.io.*;

public class P17478 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Q(n));
        } catch (IOException e) {}
    }

    public static String Q(int n, int line, StringBuilder sb) {
        int tab = line * 4;
        StringBuilder ulsb = new StringBuilder();

        for (int i = 0; i < tab; ++i) ulsb.append("_");

        sb.append(ulsb.toString()).append("\"재귀함수가 뭔가요?\"").append('\n');
        
        if (n == line) {
            sb.append(ulsb.toString()).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append('\n');
            
            while (tab >= 0) {
                ulsb.setLength(0);

                for (int i = 0; i < tab; ++i) ulsb.append("_");
                sb.append(ulsb.toString()).append("라고 답변하였지.").append('\n');

                tab -= 4;
            }

            return sb.toString();
        } else {
            sb.append(ulsb.toString()).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append('\n');
            sb.append(ulsb.toString()).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append('\n');
            sb.append(ulsb.toString()).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append('\n');

            return Q(n, line + 1, sb);
        }
    }

    public static String Q(int n) {
        return Q(n, 0, new StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n"));
    }
}
