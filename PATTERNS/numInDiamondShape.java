/*          1
        2   3   2
    3   4   5   4   3
        2   3   2
            1
 * 
 * 
 * 
 */
import java.util.*;
public class numInDiamondShape {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        int sp=2,st=1;
        int pt=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            int pt2=pt;
            for(int j=1;j<=st;j++){

                System.out.print(pt2+"\t");
                if(j<=n/2){
                    pt2++;
                }
                else{
                    pt2--;
                }
            }
            if(i<=n/2){
                pt++;
                sp--;
                st+=2;
            }
            else{
                pt--;
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
    
}
