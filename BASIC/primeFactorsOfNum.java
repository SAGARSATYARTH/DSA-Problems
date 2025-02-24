import java.util.*;
class primeFactorsOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        for(int div=2;div*div<=num;){
            if(num%div==0){
                System.out.println(div);
                num=num/div;
            }
            else{
                div++;
            }
            
        }
        if(num!=1){
            System.out.println(num);
        }

    }    
}
