// 외계어 사전 
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        StringBuilder alien = new StringBuilder();
        
        for(int i = 0; i < dic.length; i++) {
            if(alienDic(spell, dic[i])) {
                answer = 1;
            }
        }
        
        return answer;
    }
    
    public boolean alienDic(String[] spell, String dic) {
        StringBuilder alien = new StringBuilder(dic);
        
        for(int i = 0; i < spell.length; i++) {
            if(alien.indexOf(spell[i]) >= 0) {
                //System.out.println("alien : " + alien + ", spell[j] : " + spell[i] + ", j : " + i);
                alien = alien.deleteCharAt(alien.indexOf(spell[i]));
                //System.out.println(">> " + alien.length());
            } else {
                return false;
            }
        }
        
        if(alien.length() == 0) {
            return true;
        }
        
        return false;
    }
}

// ----------------------------------굳이 StirngBuilder을 쓸 필요가 없었다.-----------------------------------------------------
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        StringBuilder alien = new StringBuilder();
        
        for(int i = 0; i < dic.length; i++) {
            if(alienDic(spell, dic[i])) {
                answer = 1;
            }
        }
        
        return answer;
    }
    
    public boolean alienDic(String[] spell, String dic) {
        String alien = dic;
        
        for(int i = 0; i < spell.length; i++) {
            if(alien.indexOf(spell[i]) >= 0) {
                alien = alien.replace(spell[i], "");
            } else {
                return false;
            }
        }
        
        if(alien.length() == 0) {
            return true;
        }
        
        return false;
    }
}

