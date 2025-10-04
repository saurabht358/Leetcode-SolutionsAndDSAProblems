// #math #roman #simulation
class Solution {
    public String intToRoman(int num) {
         

        StringBuilder ans = new StringBuilder();
 

            while(num >= 1000){
                num-=1000;
                ans.append("M");
            }while(num >= 900){
                num-=900;
                ans.append("CM");
            }while(num >= 500){
                num-=500;
                ans.append("D");
            }while(num >= 400){
                num-=400;
                ans.append("CD");
            }while(num >= 100){
                num-=100;
                ans.append("C");
            }while(num >= 90){
                num-=90;
                ans.append("XC");
            }while(num >= 50){
                num-=50;
                ans.append("L");
            }while(num >= 40){
                num-=40;
                ans.append("XL");
            }while(num >= 10){
                num-=10;
                ans.append("X");
            }while(num >= 9){
                num-=9;
                ans.append("IX");
            }
            if(num>=5){
                num-=5;
                ans.append("V");
            }
            if(num>=4){
                num-=4;
                ans.append("IV");
            }
            while(num>=1){
                num--;
                ans.append("I");
            } 
      
        return ans.toString();
         

    }
}
