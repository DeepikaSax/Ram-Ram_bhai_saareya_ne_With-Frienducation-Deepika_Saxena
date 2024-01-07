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
public class missing 
{
     public int solution(int[] nums) 
    {
        int sum=0;
        int n=nums.length;
        int Sum= (n*(n+1))/2;
        int i;
        for(i=0;i<n;i++)
         sum=sum+nums[i];
        return(Sum-sum);
    }
    public static void main(String args[])
    {
        int arr[];
        int n,ans;
        Scanner sc=new Scanner(System.in);
        bestTime ds=new bestTime();
        System.out.println("Enter the number of elements in aaray");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" Numbers in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ans= ds.solution(arr);
        System.out.println("Missing number is");
        System.out.println(ans);
    }
}
