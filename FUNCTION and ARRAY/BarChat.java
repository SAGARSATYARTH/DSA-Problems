/*
 Enter n : 5
Enter 5 numbers : 3
1
0
7
5
                        *
                        *
                        *       *
                        *       *
*                       *       *
*                       *       *
*       *               *       *
 */

import java.util.*;
public class BarChat {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("Enter "+n+" numbers : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
