import java.util.*;
public class fabonicseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        for(int i =0;i<=n;i++) {
             System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
