package hwprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Merge_Sorted_Array {
	
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] arr1= {1,2,3,0,0,0};
		int[] arr2= {2,5,6};
		int m=3,n=3;
		
        // doMergeArraySort(arr1,arr2,m,n);
         doMergeArraySort_Brute(arr1,arr2,m,n);
	}

	//@Test // +ve
	public void example12() {
		int[] arr1= {1,1,2,0,0,0};
		int[] arr2= {1,1,6};
		int m=3,n=3;
		
         doMergeArraySort(arr1,arr2,m,n);
	}

//	@Test // +ve
	public void example121() {
		int[] arr1= {0,1,2,0,0,0};
		int[] arr2= {0,1,6};
		int m=3,n=3;
		
         doMergeArraySort(arr1,arr2,m,n);
	}

	
	
	//@Test // edge
		public void example22() {
			
			int[] arr1= {4,5,6,0,0,0};
			int[] arr2= {1,2,3};
			int m=3,n=3;
			
	         doMergeArraySort(arr1,arr2,m,n);
			
		}

		public void doMergeArraySort_Brute(int[] arr1, int[] arr2, int m, int n) 
		{
			List li = Arrays.asList(arr1);
			int j=0;
			for(int i=0;i<li.size();i++)
			{
				if(li.get(i)==Integer.valueOf(0))
				{
					li.set(i,arr2[j++]);
				}
			}
			Collections.sort(li);
			
			System.out.println(li);
		}
		
		
		private void doMergeArraySort(int[] arr1, int[] arr2, int m, int n) {
			// TODO Auto-generated method stub
			
			int p1=m-1,temp=0;
			int p2=arr2.length-1;
			int index=arr1.length-1;
		
			
			while(p1>=0 && p2 >=0)
			{
				if(arr1[p1]>arr2[p2])
				{
					
					temp=arr1[p1];
					arr1[p1]=arr1[index];
					arr1[index]=temp;
					index--;
					p1--;
					
					
				}else
				{
					temp=arr2[p2];
					arr2[p2]=arr1[index];
					arr1[index]=temp;
					index--;
					p2--;
					
				}
				
			
			}
			
			while(p2 >= 0 )
			{
				
				arr1[index]=arr2[p2];
				p2--;
				index--;
			}
			System.out.println(Arrays.toString(arr1));
		}
}
