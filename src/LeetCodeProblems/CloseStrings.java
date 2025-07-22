package LeetCodeProblems;

import java.util.*;

public class CloseStrings {
    private boolean isClose(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);

        for (char ch:word1.toCharArray()) {
            arr1[ch-'a']++;
        }
        for (char ch:word2.toCharArray()) {
            arr2[ch-'a']++;
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<26;i++){
            if(arr1[i]!=0){
                list1.add(arr1[i]);
            }
        }
        for(int i=0;i<26;i++){
            if(arr2[i]!=0){
                list2.add(arr2[i]);
            }
        }
        if(list1.size()!=list2.size()) return false;
        Collections.sort(list1);
        Collections.sort(list2);


        for (int i = 0; i < list2.size() ; i++) {
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }

        return true;


    }
    public static void main(String[] args) {
        CloseStrings closeStrings = new CloseStrings();
        boolean result = closeStrings.isClose("abbzzca","babzzcz");
//        "abbzzca"
//        "babzzcz"
        System.out.println(result);
    }

}
