import java.util.Scanner;
public class MoveZeros{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){ 
            a[i]=s.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                int t=a[i];
                a[i]=a[j];
                a[j++]=t;
            }
        }
        System.out.print("Result: ");
        for(int i:a){ 
            System.out.print(i+" ");
        }
        s.close();
    }
}
