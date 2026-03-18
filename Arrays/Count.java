import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print("Target: ");
        int t=s.nextInt();
        int f=idx(a,t,true);
        if(f==-1){ 
            System.out.print("Count: 0");
        }
        else{ 
            System.out.print("Count: "+(idx(a,t,false)-f+1));
        }
        s.close();
    }
    static int idx(int[] a,int t,boolean fst){
        int l=0,h=a.length-1,r=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==t){
                r=m;
                if(fst) h=m-1;
                else l=m+1;
            } 
            else if(a[m]<t){ 
                l=m+1;
            }
            else{ 
                h=m-1;
            }
        }
        return r;
    }
}
