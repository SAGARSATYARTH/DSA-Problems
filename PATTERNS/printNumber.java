// printing numbers in right triangle shape
/*      
1
2   3
4   5   6
7   8   9   10
11  12  13  14   15
*/

import java.util.Scanner;
public class printNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
    
}

