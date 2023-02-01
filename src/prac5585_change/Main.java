package prac5585_change;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution s= new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        bw.write(String.valueOf(s.solution(n)));
        bw.close();
    }
}

class Solution {
    public int solution(int n) {
        int budget = 1000-n;
        int change = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};
        int coinNum=0;

        while(budget!=0) {
            change += budget/coins[coinNum];
            budget -= budget/coins[coinNum]*coins[coinNum];
            coinNum++;
        }


        return change;
    }
}