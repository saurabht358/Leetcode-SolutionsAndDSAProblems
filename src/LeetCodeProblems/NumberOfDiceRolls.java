package LeetCodeProblems;

public class NumberOfDiceRolls {
    public static void main(String[] args) {
        dice("",4,6);
        System.out.println();
        System.out.println(diceCount("",6,6,2));

    }
    static void dice(String p,int target,int face){
        if(target==0){
            System.out.print(p +" ");
            return;
        }

        for(int i=1;i<=face && i<=target ;i++){
            dice(p+i,target-i,face);
        }
    }
    static int diceCount(String p,int target,int face,int n) {
        if (target == 0) {
            if(p.length()==n) return 1;
            return 0;
        }
        int count=0;

        for (int i = 1; i <= face && i <= target; i++) {

           count+= diceCount(p + i, target - i, face,n);
        }
        return count;
    }

}
