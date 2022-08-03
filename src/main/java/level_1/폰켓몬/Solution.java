package level_1.폰켓몬;

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = (int) Arrays.stream(nums).boxed().distinct().count();
        return answer <= nums.length/2 ? answer : (int) nums.length/2;
    }
}