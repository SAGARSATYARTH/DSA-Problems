import java.util.*;
class gcdLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2=sc.nextInt();
        int orgn1=n1;
        int orgn2=n2;
        while(n2%n1!=0){
            int r=n2%n1;
            n2=n1;
            n1=r;
        }
        int gcd=n1;
        int lcm=(n1*n2)/gcd;

        System.out.println("gcd : "+n1);
        System.out.println("lcm : "+lcm);
    }
    
}
