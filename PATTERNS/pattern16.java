import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        int sp=n+1;
        int sj=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
                sj=j;
            }
            for(int s=1;s<=sp;s++){
                System.out.print("0\t");
            }
            if(i==n){
                sj--;
            }
            for(int j=sj;j>=1;j--){
                System.out.print(j+"\t");
            }
            sp-=2;

            System.out.println();
        }
    }
    
}
