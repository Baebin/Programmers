package level_1.카카오인턴키패드누르기;

class Solution {
    int left, right, num;
    public String solution(int[] numbers, String hand) {
        String answer = "";

        // * = 10, # = 12
        left = 10;
        right = 12;

        for (int i : numbers) {
            switch (i) {
                case 1, 4, 7:
                    answer += "L";
                    left = i;
                    continue;
                case 3, 6, 9:
                    answer += "R";
                    right = i;
                    continue;
                case 0:
                    // 키패드 순서
                    num = 11;
                    break;
                default:
                    num = i;
                    break;
            }

            if (hand.equals("left")) {
                if (getDistance(num, left) <= getDistance(num, right)) {
                    left = num;
                    answer += "L";
                } else {
                    right = num;
                    answer += "R";
                }

                continue;
            }

            // right
            if (getDistance(num, right) <= getDistance(num, left)) {
                right = num;
                answer += "R";
            } else {
                left = num;
                answer += "L";
            }
        }

        return answer;
    }

    int x, y, xh, yh;
    public int getDistance(int num, int hand) {
        // 1 = 원점(0, 0)
        x = 1; y = (num - 1) / 3;
        xh = (hand - 1) % 3; yh = (hand - 1) / 3;

        return Math.abs(x-xh) + Math.abs(y-yh);
    }
}