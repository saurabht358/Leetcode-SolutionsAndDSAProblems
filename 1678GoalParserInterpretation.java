class Solution {
    public String interpret(String command) {
        char []str = command.toCharArray(); // Convert string to char array
        StringBuilder ans= new StringBuilder();  // StringBuilder for adding & replace char
        for(int i=0;i<str.length;i++){
            if(str[i]=='(' && str[i+1]==')'){ // if command consists "()" then replace with "o"
                ans.append('o');
                i++;
            }else if(str[i]=='(' && str[i+1]=='a' && str[i+2]=='l' && str[i+3]==')'){  // if command consists "(al)" then replace with "al"
                ans.append('a');
                ans.append('l');
                i+=3;
            }else{  // if command consists niether "()" nor "(al)" then append as it is ans
                ans.append(str[i]);
            }
        }
        return ans.toString(); // at the end convert StringBuilder to String ans return to it
    }
}
