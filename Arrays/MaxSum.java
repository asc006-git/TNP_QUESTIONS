import java.util.Scanner;
public class MaxSum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){ 
            a[i]=s.nextInt();
        }
        int m=a[0];
        int c=0;
        for(int x:a){
            c+=x;
            if(c>m){ 
                m=c;
            }
            if(c<0){ 
                c=0;
            }
        }
        System.out.print("Max Sum: "+m);
        s.close();
    }
}
