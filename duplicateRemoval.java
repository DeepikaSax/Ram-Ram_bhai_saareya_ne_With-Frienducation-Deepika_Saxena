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
public class duplicateRemoval 
{
    int solution(int nums[]) 
    {
        int k,i=0,j,n;
        n=nums.length;
        int num[]=new int[n];
        num[0]=nums[0];
        j=1;
        while(i<n)
        {
            if(num[j-1]!=nums[i])
             num[j++]=nums[i];
            i++;
        }
        k=j;
        for(i=0;i<k;i++)
         nums[i]=num[i];
        return k;
    }
    public static void main(String args[])
    {
        int arr[];
        int n,ans;
        Scanner sc=new Scanner(System.in);
        duplicateRemoval ds=new duplicateRemoval();
        System.out.println("Enter the number of elements in aaray");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" Numbers in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ans= ds.solution(arr);
        System.out.println("Length after removing duplicates");
        System.out.println(ans);
    }
}
