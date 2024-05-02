class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans= new char[indices.length]; // create a array of length equals to length of indices array
        int i=0;
        for(char ch:s.toCharArray()){ // traverse string char by char 
            ans[indices[i++]] = ch;    // insert character to its given indices
        }
        StringBuilder str = new StringBuilder();  //Create  a StringBuilder Objects and Convert Array to StringBuilder
        for(int j=0;j<indices.length;j++) str.append(ans[j]);  
        return str.toString(); // Convert StringBuilder to String and return it 
    }
}
