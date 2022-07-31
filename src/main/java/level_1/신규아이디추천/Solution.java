package level_1.신규아이디추천;
class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if (new_id.equals(""))
            return "aaa";
        if (new_id.length() >= 16)
            new_id = new_id.substring(0, 15)
                    .replaceAll("[.]$", "");
        else if (new_id.length() <= 2) {
            char c = new_id.charAt(new_id.length() - 1);
            for (int i = 0; i < 4 - new_id.length(); i++)
                new_id += c;
        }

        return new_id;
    }
}