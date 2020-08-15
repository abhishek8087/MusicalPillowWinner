package practice;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("number of people :");
        int n = sc.nextInt();
        System.out.print("time duration of the song in seconds :");
        int k = sc.nextInt();
        System.out.println("Winner's Tag number : "+ winnerTagNo(n,k));
    }

    static int winnerTagNo(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            return (winnerTagNo(n - 1, k) + k-1) % n + 1;
    }
}
