import java.util.*;
class fibonacciTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=num;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
