import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int dnum=scn.nextInt();
        System.out.print("Enter base : ");
        int base=scn.nextInt();
        System.out.println("Decimal number "+dnum+" in base "+base+" is "+decToAnyBase(dnum, base));

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
