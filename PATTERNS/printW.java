/*
*                               *
*                               *
*               *               *
*       *               *       *
*                               *
 */
import java.util.Scanner;

public class printW {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt(); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*\t");
                }
                else if(i>n/2 && (i+j==n+1 || i==j )){
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
