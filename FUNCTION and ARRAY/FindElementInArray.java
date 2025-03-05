// In this we have find a value in given array and display the index ,if found otherwise -1.

import java.util.*;
public class FindElementInArray {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("Enter "+n+" numbers : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter d : ");
        int d=scn.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("-1");
        }
    }
}
