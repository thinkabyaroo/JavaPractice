public class BubbleSort {
    public static void main(String[] args){
        int nums[] = {8,7,5};
        Sorting(nums);  //7,8,5 //7,5,8 //5,7,8
      

    }
    public static void Sorting(int[] nums){
        int count =0;                     
        for (int i=0; i<nums.length; i++)  
        {
            count++;
            for(int j=0; j<nums.length-i-1 ;j++){ 
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }
        System.out.println("count>> "+count);
        System.out.print("after sorting>> ");
        for( int num:nums){
            System.out.print(num +" ");

        }
    }


}
