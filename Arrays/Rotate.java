import java.util.Scanner;
public class Rotate{
 public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){ 
            a[i]=s.nextInt();
        }
        System.out.print("K: ");
        int k=s.nextInt()%n;
        r(a,0,n-1);
        r(a,0,k-1);
        r(a,k,n-1);
        System.out.print("Result: ");
        for(int i:a){ 
            System.out.print(i+" ");
        }
        s.close();
    }
    static void r(int[] a,int b,int e){
        while(b<e){
            int t=a[b];
            a[b++]=a[e];
            a[e--]=t;
        }
    }
}
