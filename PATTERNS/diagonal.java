import java.util.Scanner;
public class diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
