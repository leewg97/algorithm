package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 바이러스(BFS)
public class BJ_2606 {

    static int N, M, sum;
    static int[][] arr;
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }

        check = new boolean[N + 1];
        bfs(1);
        System.out.println(sum);
    }

    public static void bfs(int start) {
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();

            for (int i = 0; i <= N; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                    sum++;
                }
            }
        }
    }
}
