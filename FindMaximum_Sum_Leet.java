package slidding_wind;

import org.junit.Test;

public class FindMaximum_Sum_Leet {
	/**
    * 1. Add first k-1 elements
    * 2. Add end of the window element
    * 3. Find the maximum value
    * 4. subtract the first element in the array window
    * 5. repeat 2-4 till end of the array
    * 6. return max average
    */

   @Test
   public void td4(){
       int[] input = new int[]{1, -5, 30, -12};
       int k = 4;
       System.out.println(sliding_window(input, k));
   }

   @Test
   public void td1(){
       int[] input = {1,5,3,0};
       int k =2;
       System.out.println(sliding_window(input, k));
   }

   @Test
   public void td2(){
       int[] input = {1,5,3,0};
       int k = 1;
       System.out.println(sliding_window(input, k));
   }

   @Test
   public void td3(){
       int[] input = {1,-5,30,-12};
       int k = 3;
       System.out.println(sliding_window(input, k));
   }


   private int bruteForce(int[] input, int k){
       int maximum = Integer.MIN_VALUE;
       for(int i =0; i <= input.length-k; i++){
           int sum = input[i];
           for(int j =i+1; j <i+k ; j++){
               sum += input[j];
           }
           maximum = Math.max(maximum, sum);
       }
       return maximum;
   }
   //Time - O[N], Space - O[1]
   private int sliding_window(int[] input, int k){
       int maximum = Integer.MIN_VALUE, pointer = 0, sum =0;

       while(pointer < k-1)
           sum += input[pointer++];

       while(pointer < input.length){
           sum += input[pointer++];
           maximum = Math.max(maximum, sum);
           sum -= input[pointer-k];
       }
       return maximum;
   }

   //two pointer
   private int maxSum(int[] input, int k) {
       if (input.length < k) return 0;
       int left = 0, right = 1, sum = 0,  maxSum = Integer.MIN_VALUE;

       while(right < k-1) sum += input[right++];

       while (left <= input.length-k+1 ) {
           sum += input[right++];
           maxSum = Math.max(sum, maxSum);
           sum -= input[left++];
       }
       return maxSum;
   }


}
