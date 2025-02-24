import java.util.*;
class printNumberInReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        int num=sc.nextInt();

        while(num!=0){
            int r=num%10;
            System.out.println(r);
            num/=10;
        }
    }
    
}
