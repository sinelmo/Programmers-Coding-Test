// 문자열 내 마음대로 정렬하기
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> sortList = new ArrayList<>();
        
        for(String str : strings) {
            sortList.add(str);
        }
        
        Collections.sort(sortList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            }
        });
        
        return sortList.toArray(new String[sortList.size()]);
    }
}
