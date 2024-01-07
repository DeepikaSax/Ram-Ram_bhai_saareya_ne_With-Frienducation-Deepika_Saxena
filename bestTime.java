package deepika;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepi
 */
public class bestTime 
{
    public int solution(int[] prices) 
    {
        int lp=0;
        int rp=1;
        int maxp=0;
        while(rp<prices.length)
        {
            if(prices[lp]>prices[rp])
            {
                 lp=rp;
            }
            else if(prices[lp]<prices[rp])
            {
                if(prices[rp]-prices[lp]>maxp)
                   maxp=prices[rp]-prices[lp];
            }
            rp++;
        }
        return maxp;
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
        System.out.println("Maximum profit day");
        System.out.println(ans);
    }
}

