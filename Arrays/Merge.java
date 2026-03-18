import java.util.*;
public class Merge{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size1: ");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){ 
            a[i]=s.nextInt();
        }
        System.out.print("Size2: ");
        int m=s.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){ 
            b[i]=s.nextInt();
        }
        int i=n-1,j=0;
        while(i>=0&&j<m){
            if(a[i]>b[j]){
                int t=a[i];a[i]=b[j];b[j]=t;
                i--;j++;
            } 
            else 
                break;
        }
        Arrays.sort(a);Arrays.sort(b);
        System.out.print("Result: ");
        for(int x:a){ 
            System.out.print(x+" ");
        }
        for(int x:b){ 
            System.out.print(x+" ");
        }
        s.close();
    }
}
