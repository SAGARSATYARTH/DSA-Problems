import java.util.*;
class printDigitInNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num=sc.nextInt();
        while(num!=0){
            int r=num/100;
            System.out.println(r);
            num/=10;
        }
    }
    
}
