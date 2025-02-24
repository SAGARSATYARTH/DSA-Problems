import java.util.*;
class countDigitInNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            // int r=num%10;// not required
            num=num/10; 
            count++;
        }
        System.out.println("Digits is : "+count);

    }
}
