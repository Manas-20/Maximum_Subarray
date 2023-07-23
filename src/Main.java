import java.util.*;
import java.math.*;

public class Main {
    static int maxSubArray (int[] nums)
    {
        int maxsum=Integer.MIN_VALUE,currsum=0;
        for(int i=0;i< nums.length;i++)
        {

            currsum=Math.max(currsum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,currsum);

        }
        return maxsum;
    }
    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        int i=0;
        while (i<n)
        {
            nums[i]=sc.nextInt();
            i++;
        }
        System.out.println(maxSubArray(nums));
    }
}