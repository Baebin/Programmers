package level_1.스킬체크테스트;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";

        int mid = (int) Math.floor(s.length()/2);
        if (s.length() % 2 == 0)
            answer = s.substring(mid-1, mid+1);
        else answer = s.charAt(mid) + "";
        return answer;
    }
}

class Solution2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}