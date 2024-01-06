/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepika;
import java.util.*;
/**
 *
 * @author Deepi
 */
public class twoSum 
{
    public int[] solution(int[] nums, int target) 
    {
        int i,j;
        int ans[]=new int [2];
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                 {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                 }
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr[];
        int n;
        Scanner sc=new Scanner(System.in);
        twoSum ds=new twoSum();
        System.out.println("Enter the number of elements in aaray");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" Numbers in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter sum needed");
        int t=sc.nextInt();
        int ans[]=ds.solution(arr,t);
        System.out.println("Indices Of the numbers needed are");
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
