package TCSNQT;
import java.util.*;

class Team{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine().trim();
        String[] arr = input.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(char ch:arr[0].trim().toCharArray()){
            if(ch!=' '){
                list.add(ch-'a');
            }
        }
        int n = list.size();
        ArrayList<ArrayList<Integer>> skils = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            skils.add(new ArrayList<>());
            for(char ch:arr[i+2].trim().toCharArray()){
                if(ch!=' '){
                    skils.get(i).add(ch-'a');
                }
            }
            System.out.println(skils.get(i));
        }
        Set<Integer> set = new HashSet<>();

        boolean include [] = new boolean[n];
        while(set.size()!=n){
            int maxSkill = -1;
            int can = -1;
            for(int i=0;i<n;i++){
                if(!include[i]){
                    if(maxSkill < skils.get(i).size()){
                        maxSkill = skils.get(i).size();
                        can = i;
                    }
                }
            }
            include[can] = true;
            for(int sk:skils.get(can)){
                set.add(sk);
            }
            System.out.print(can + " ");
        }

//        a b c d , 4 , a b , c , c d , d

    }

}