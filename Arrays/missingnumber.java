import java.util.Scanner;
public class missingnumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The valu of N : ");
        int n=s.nextInt();
        int e=n*(n+1)/2;
        int a=0;
        for(int i=0;i<n-1;i++){
            a+=s.nextInt();
        }
        System.out.println("Missing Number : " +(e-a));
        s.close();
    }
}
