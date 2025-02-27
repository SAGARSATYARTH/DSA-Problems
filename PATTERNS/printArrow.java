/* n=7
                         *
                        *       *
                        *       *       *
*       *       *       *       *       *       *
                        *       *       *
                        *       *
                        *
 */
import java.util.*;
public class printArrow {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scn.nextInt();
        int sp=n/2,st=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
    }
    
}
