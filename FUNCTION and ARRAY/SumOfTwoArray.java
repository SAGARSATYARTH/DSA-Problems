import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1=scn.nextInt();
        System.out.print("Enter "+n1+" numbers : ");
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        System.out.print("Enter n2 : ");
        int n2=scn.nextInt();
        System.out.print("Enter "+n2+" numbers : ");
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }
        int arr3[]=new int[n1>n2?n1:n2];
        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
        while(k>=0){
            int d=c;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c=d/10;
            arr3[k]=d%10;
            i--;
            j--;
            k--;

        }
        System.out.println("-------");
        if(c!=0){
            System.out.println(c);
        }
        for(int value:arr3){
            System.out.println(value);
        }
        
    }
    
}
