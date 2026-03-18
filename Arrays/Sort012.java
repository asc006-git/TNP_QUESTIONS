import java.util.Scanner;
public class Sort012{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==0){
                int t=a[l];
                a[l++]=a[m];
                a[m++]=t;
            } 
            else if(a[m]==1){
                m++;
            } 
            else{
                int t=a[m];
                a[m]=a[h];
                a[h--]=t;
            }
        }
        System.out.print("Sorted: ");
        for(int x:a){ 
            System.out.print(x+" ");
        }
        s.close();
    }
}
