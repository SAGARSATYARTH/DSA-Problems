import java.util.Scanner;

class benjaminBulbs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
    
}
