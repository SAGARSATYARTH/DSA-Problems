import java.util.*;
public class printTableOf_n {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+ i+" = "+i*n);
        }
    }
    
}
