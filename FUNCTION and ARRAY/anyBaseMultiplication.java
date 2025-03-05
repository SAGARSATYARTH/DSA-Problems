import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1=scn.nextInt();
        System.out.print("Enter n2 : ");
        int n2=scn.nextInt();
        System.out.print("Enter base : ");
        int b=scn.nextInt();
        int product=getProduct(n1, n2, b);
        System.out.println(product);
    }
    public static int getProductWithASingleDigit(int b,int n1,int d2){
        int rv=0;
        int c=0;
        int p=1;
        while (n1>0 || c>0) {
            int d1=n1%10;
            n1=n1/10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            rv=rv+d*p;
            p=p*10;
        }
        return rv;
    }
    public static int getProduct(int b,int n1,int n2){
        int rv=0;
        int p=1;
        while (n2>0) {
            int d2=n2%10;
            n2=n2/10;
            
            int sprd=getProductWithASingleDigit(b,n1,d2);
            rv=getsum(b,rv,sprd * p);
            p=p*1;
            
        }
        return rv;
    }
    public static int getsum(int b,int n1,int n2){
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
