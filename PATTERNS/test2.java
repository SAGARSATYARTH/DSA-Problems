/*          *   *   *   *   *
            *   *   *   *
            *   *   *
            *   *
            *
*/

import java.util.Scanner;

class test2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter n : ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
