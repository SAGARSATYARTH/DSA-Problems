import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1=scn.nextInt();
        System.out.print("Enter n2 : ");
        int n2=scn.nextInt();
        System.out.print("Enter base : ");
        int b=scn.nextInt();
        int sum=getsum(n1, n2, b);
        System.out.println("Add "+n1+" + "+n2+" in base "+b+" is : "+sum);

    }
    public static int getsum(int n1,int n2,int b){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int n1d=n1%10;
            int n2d=n2%10;
            n1=n1/10;
            n2=n2/10;

            int nd=n1d+n2d+c;
            c=nd/b;
            nd=nd%b;

            rv+=nd*p;
            p*=10;
        }
        return rv;
    }
}
