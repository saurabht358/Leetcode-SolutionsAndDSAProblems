package TCSNQT;
import java.util.*;
public class FirstNonRepeating {
        public static void main(String ar[]){
            Scanner sc = new Scanner(System.in);
            String input = sc.next().trim();
            int[] freq = new int[26];
            for(char ch:input.toCharArray()){
                freq[ch-'a']++;
            }
            int max = 0;
            boolean conflict= false;
            char nRep='0' ;
            for(char ch:input.toCharArray()){
                if(freq[ch-'a']==1){
                    nRep = ch;
                    break;
                }
            }
            int ans = 0;
            for(int i=0;i<26;i++){
                if(max < freq[i]){
                    ans = i;
                    max = freq[i];
                }else if(max==freq[i]){
                    conflict = true;
                }
            }
            if(nRep=='0'){
                System.out.println("None");
            }else{
                System.out.println(nRep);
            }
            if(conflict){
                for(char ch:input.toCharArray()){
                    if(freq[ch-'a']==max){
                        System.out.println(ch);
                        break;
                    }
                }
            }else{
                System.out.println((char)('a'+ans));
            }


        }

}
