package level_1.크레인인형뽑기게임;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int item;
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                item = board[i][m-1];
                if (item == 0) continue;

                board[i][m-1] = 0;
                if (!stack.isEmpty() && stack.peek() == item) {
                    stack.pop();
                    answer += 2;
                } else stack.push(item);
                break;
            }
        }
        return answer;
    }
}