package prac8958_ox_quiz;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution s= new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i = 0; i < n ; i++) {
            str[i] = br.readLine();
        }

        //얌전히 sout 쓰는 케이스

        s.solution(str);

        //bw 쓰겠다고 깝친 케이스

//        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
//
//        bw.write(s.solution(str));
//        bw.close();
    }
}

class Solution {
    public String solution(String[] str) {

        int[] score = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            int count = 0;

            for (int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == 'O') {
                    count++;
                    score[i] +=count;
                }
                if(str[i].charAt(j) == 'X') {
                    count = 0;
                }
            }
        }

        //얌전히 sout 쓰는 케이스
        for (int j : score) {
            System.out.println(j);
        }

        return "";

        //solution 자체에서 답 보내서 bw로 출력하는 케이스
//        String answer = "";
//
//        for (int i = 0; i < score.length; i++) {
//            if(i == score.length-1) {
//                answer += ""+score[i];
//            } else {
//                answer += ""+score[i]+"\n";
//            }
//        }
//
//        return answer;
    }
}



//while(stk.hasMoreTokens()){
//		System.out.println(stk.nextToken());
//	}