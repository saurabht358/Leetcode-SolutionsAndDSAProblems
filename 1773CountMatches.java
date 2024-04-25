class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rk,count=0;
        if(ruleKey.equals("type")) rk = 0;
        else if(ruleKey.equals("color")) rk=1;
        else rk=2;

        for(int i=0;i<items.size();i++){
            if(items.get(i).get(rk).equals(ruleValue)) count++;
        }
        return count;
    }
}
