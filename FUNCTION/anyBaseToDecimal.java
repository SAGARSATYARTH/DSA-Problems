import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=scn.nextInt();
        System.out.print("Enter base : ");
        int b=scn.nextInt();
        System.out.println(n+" in base "+b+" to decimal is "+bToDecimal(n, b));

    }
    public static int bToDecimal(int n,int b){
        int rv=0;
        int p=0;
        while (n!=0) {
            int digit=n%10;
            rv=rv+(digit*(int)Math.pow(b, p));
            n/=10;
            p++;
        }
        return rv;
    }
}