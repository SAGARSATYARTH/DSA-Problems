/*                            *****
                               ****
                                ***
                                 **
                                  *
*/

import java.util.Scanner;

class test4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();

        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
