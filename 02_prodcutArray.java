class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        int[] res = new int[nums.length];
        
         int ans = 1;
         int count = 0;
         // Getting the product of all elements except zeros
        for(int i=0; i<nums.length; i++){

            if(nums[i] != 0){
                ans *= nums[i];
            }

            // We taking a count because we want to handle the multiple zeros cases
            else{
                count++;
            }
        }


        for(int i=0; i<nums.length; i++){

            if(count == 1){  // if there exist only one zero then we just simply putting the total product in the current index
                if(nums[i] == 0){
                    res[i] = ans;
                }
                else{ // 
                    res[i] = 0; // here all the answer would be zero because there exist a zero in the nums array
                }
            }
            else if(count > 1){ // This handles multiple zero case, if we counter zero which is more than 1 then we simply store 0 in the answer becasue multiply by zero by any number will be zero for the rest of the answer
                res[i] = 0;
            }
            else{  // This is for non zero values
                res[i] = ans / nums[i];
            }
        }


        return res;
    }
}