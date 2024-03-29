package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부녀회장이 될테야
public class BJ_2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];

        dp(dp);

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[K][N]).append('\n');
        }
        System.out.println(sb);
    }

    private static void dp(int[][] dp) {
        for (int i = 0; i < 15; i++) {
            dp[i][1] = 1;   // i층 1호
            dp[0][i] = i;   // 0층 i호
        }

        for (int i = 1; i < 15; i++) {      // 1층부터 14층까지
            for (int j = 2; j < 15; j++) {  // 2호부터 14호까지
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
    }
}
