package BaekJoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 큐 2
public class BJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    Integer num = q.poll();
                    if (num == null) {
                        sb.append(-1).append('\n');
                    } else sb.append(num).append('\n'); break;

                case "empty":
                    if (q.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n'); break;

                case "size":
                    sb.append(q.size()).append('\n'); break;

                case "front":
                    Integer front = q.peek();
                    if (front == null) sb.append(-1).append('\n');
                    else sb.append(front).append('\n'); break;

                case "back":
                    Integer back = q.peekLast();
                    if (back == null) sb.append(-1).append('\n');
                    else sb.append(back).append('\n'); break;
            }
        }
        System.out.println(sb);
    }
}
