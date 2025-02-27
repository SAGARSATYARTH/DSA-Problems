/*
 *       *       *       *       *
        *               *
                *
        *       *       *
*       *       *       *       *
 */
import java.util.*;
class printHourGlass{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        int st=n,sp=0;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i<=n/2 && i>1 && j>1 && j<st){
                    System.out.print("\t");
                }else{

                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                st-=2;
                sp++;
            }else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }
}