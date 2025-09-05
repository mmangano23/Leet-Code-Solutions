class Solution {
    public int numberOfSteps(int num) { 
        int val = num;
        int count = 0;

        for (int i = 0; val != 0; i++){
            if (val%2 == 1){
                val = val-1;
            }
            else{
                val = val/2;
            }
            count++;
        }
    return count;
    }
}