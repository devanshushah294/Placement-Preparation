import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Program12 {
    public static boolean helper(String s, List<String> list, HashMap<String, Boolean> map) {
        if (s.length() == 0) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for (String word : list) {
            if (s.startsWith(word)) {
                String subStr = s.substring(word.length());
                if (helper(subStr, list, map)) {
                    map.put(s, true);
                    return true;
                }
            }
        }
        map.put(s, false);
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return helper(s, wordDict, map);
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String[] words = { "leet", "code" };
        List<String> list = new ArrayList<>();
        for (String s : words) {
            list.add(s);
        }
        System.out.println(wordBreak(str, list));
    }
}