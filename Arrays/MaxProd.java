import java.util.Scanner;
public class MaxProd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        long res=a[0],mx=a[0],mn=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<0) {
                long t=mx;
                mx=mn;
                mn=t;
            }
            mx=Math.max(a[i],mx*a[i]);
            mn=Math.min(a[i],mn*a[i]);
            res=Math.max(res,mx);
        }
        System.out.print("Max Product: "+res);
        s.close();
    }
}
