import java.util.Scanner;

public class anyToAnyBase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        System.out.print("Enter base 1 : ");
        int b1=scn.nextInt();
        System.out.print("Enter base 2 : ");
        int b2=scn.nextInt();
        int dec=0;
        int realV=0;
        if(b1==2 || b1==4 || b1==8){
            dec=bToDecimal(n, b1);
            realV=decToAnyBase(dec, b2);
        }
        else{
            realV=decToAnyBase(n, b2);
        }

        System.out.println(n+" is nummber of base "+b1+" after conversion in base "+b2+" is "+realV);

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
    public static int decToAnyBase(int dnum,int base){
        int rv=0;
        int p=0;
        while(dnum!=0){
            int r=dnum%base;
            rv=rv+(r*(int)(Math.pow(10, p)));
            p++;
            dnum/=base;
        }
        return rv;
    }

    
}
