class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // First we will sort the array
        int ans=0,i=0,j=people.length-1; //here we use two pointer approach and ans will keep track the no. of boats
                                        // where i (first )pointer points to start index
                                        // and j (second) pointer points to last index of sorted array
        while(i<=j ){ // we check till the i is less than and equal to j
            
            if(people[i] + people[j] <= limit){ // we compare the sum of first and last value with limit if it equal or less than limit then we move forward(i.e i++ & j--) our both pointer and increment the ans
                i++;j--;
                ans++;
                continue;
            }else{  //if sum of first and last value is greter than limit then we simply decrement j and increment the ans
                j--;
                ans++;
            }
        }
        return ans;  // at the end all peoples are travel then we return the value of ans
    }
}
