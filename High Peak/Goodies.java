package com.firstweb;

import java.util.Arrays;
import java.util.Scanner;

public class Goodies {

    static int m1(int arr[], int a, int b)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0; i<= a-b;i++)
            result = Math.min(result, arr[i + b - 1] - arr[i]);
        return result;
    }

    static int m2(int res,int arr[], int a, int b)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=a; i++)
        {
            result = Math.min(result, arr[i + b - 1] - arr[i]);
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        
    	System.out.println("Input of the Goodies and their Price"+"\n");
        int arr[]={999,2195,2799,4999,7980,9800,9999,11101,22349,229900};
        String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        int a = items.length;
        for(int i=0;i<a;i++)
	    {
	       System.out.println(items[i]);
	    }
        System.out.println();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int b=s.nextInt();
        
        int value=m1(arr, a, b);
        System.out.println("Number of the employees:"+b);
        int mn=m2(value,arr,a,b);
        System.out.println("selected goodies:");
        
        for(int i=mn;i<mn+b;i++)
            System.out.println(items[i]);
        System.out.println();
        System.out.println("difference b/w highest price and the lowest price of selected goodies:"+value);
    }
}
