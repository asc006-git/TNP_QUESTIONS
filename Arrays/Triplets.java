import java.util.*;
public class Triplets{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Triplets: ");
        for(int i=0;i<n-2;i++){
            if(i>0&&a[i]==a[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){
                int sum=a[i]+a[l]+a[r];
                if(sum==0){
                    System.out.print("["+a[i]+","+a[l]+","+a[r]+"] ");
                    while(l<r&&a[l]==a[l+1]) l++;
                    while(l<r&&a[r]==a[r-1]) r--;
                    l++;r--;
                } 
                else if(sum<0){ 
                    l++;
                }
                else{ 
                    r--;
                }
            }
        }
        s.close();
    }
}
