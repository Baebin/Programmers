package level_1.일차다트게임;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scoreList = new int[3];
        int index = 0; char c;
        for (int i = 0; i < dartResult.length(); i++) {
            c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (c == '1' && dartResult.charAt(i+1) == '0') {
                    scoreList[index++] = 10;
                    i++;
                } else scoreList[index++] = Character.getNumericValue(c);
                continue;
            }
            switch (c) {
                case 'S':
                    scoreList[index-1] = (int) Math.pow(scoreList[index-1], 1);
                    break;
                case 'D':
                    scoreList[index-1] = (int) Math.pow(scoreList[index-1], 2);
                    break;
                case 'T':
                    scoreList[index-1] = (int) Math.pow(scoreList[index-1], 3);
                    break;
                case '*':
                    scoreList[index-1] *= 2;
                    if (index > 1) scoreList[index-2] *= 2;
                    break;
                case '#':
                    scoreList[index-1] *= -1;
                    break;
            }
        }

        for (int score : scoreList) answer += score;
        return answer;
    }
}