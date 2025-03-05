// In this we have find max and min value in given array and display the difference btw them.

import java.util.Scanner;

public class spanOfAnArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("Enter "+n+" numbers : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Difference : "+ (max - min));
    }
}