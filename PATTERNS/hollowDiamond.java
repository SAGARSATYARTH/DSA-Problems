import java.util.*;
public class hollowDiamond {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        int osp=n/2,isp=-1,st=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=osp;s++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int s=1;s<=isp;s++){
                System.out.print("\t");
            }
            if(i!=1 && i!=n){
                System.out.print("*\t");
            }
            if(i<=n/2){
                osp--;
                isp+=2;

            }
            else{
                osp++;
                isp-=2;
            }
            System.out.println();
        }
    }
    
}
