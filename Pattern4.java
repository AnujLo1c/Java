import java.util.Scanner;

public class Pattern4{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
