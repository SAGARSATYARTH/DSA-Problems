import java.util.Scanner;

public class anyBaseSubtraction {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n2 : ");
        int n2=scn.nextInt();
        System.out.print("Enter n1 : ");
        int n1=scn.nextInt();
        System.out.print("Enter base : ");
        int b=scn.nextInt();
        int sub=getsub(n1, n2, b);
        System.out.println("sub "+n2+" - "+n1+" in base "+b+" is : "+sub);
    }
    public static int getsub(int n1,int n2,int b){
        int rv = 0;
        int c=0;
        int p=1;
        while(n2>0){
            int n1d=n1%10;
            int n2d=n2%10;
            n1/=10;
            n2/=10;
            int n=0;
            n2d=n2d+c;

            if(n2d>n1d){
                c=0;
                n=n2d-n1d;    
            }else{
                c=-1;
                n=n2d+b-n1d;
            }
            rv=rv+n*p;
            p=p*10;
        }
        return rv;
    }
}