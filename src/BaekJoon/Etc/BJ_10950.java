package BaekJoon.Etc;

import java.io.IOException;
import java.util.Scanner;

// A + B
public class BJ_10950 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[T];

        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        for(int j : arr){
            System.out.println(j);
        }
    }
}
