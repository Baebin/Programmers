package level_1.숫자문자열과영단어;

class Solution {
    public int solution(String s) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < nums.length; i++)
            s = s.replaceAll(nums[i], i + "");
        return Integer.parseInt(s);
    }
}