package hwprogram;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaximumProd_Brute {
	
	@Test
	public void postive_scenario(){
		int[] nums={3,4,5,2};
		findindex(nums);
		}

	
	@Test
		public void negative_scenario(){
		int[] nums={1};
		findindex(nums);
		}
	@Test
		public void edge_scenario(){
		int[] nums={1,2,1,2};
		findindex(nums);

		}

		/***
		2.assign maximum number = Integer.minium number
		1.traverse through the loop 0 to lastindex
		2. create inner loop through 1 1 to lastindex
		3. calculate, prod= (num[i]-1) * (nums[j]-1)
		4  if(prod > maximum) print the index
		  

		***/
	
	
		private void findindex(int[] nums) {
			// TODO Auto-generated method stub
		 
			int max=Integer.MIN_VALUE,prod=1;
			if(nums.length< 2 )  { 
				System.out.println("No Index");
			}
				
			else{
			for(int i=0;i<nums.length;i++)
			{
			for(int j=i+1;j<nums.length;j++)
			 {
			    prod=(nums[i]-1)*(nums[j]-1);
				if(prod>max)
				{
				max=prod;
				}
			  }

			}

			System.out.println("maxvalue ="+max);
		}
			
		
}
}