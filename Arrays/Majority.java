import java.util.*;
public class Majority{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int v1=0,v2=1,c1=0,c2=0;
        for(int x:a){
            if(x==v1){ 
                c1++;
            }
            else if(x==v2) {
                c2++;
            }
            else if(c1==0){
                v1=x;c1=1;
            }
            else if(c2==0){
                v2=x;c2=1;
            }
            else{
                c1--;c2--;
            }
        }
        c1=0;c2=0;
        for(int x:a){
            if(x==v1){ 
                c1++;
            }
            else if(x==v2){ 
                c2++;
            }
        }
        System.out.print("Result: ");
        if(c1>n/3){
            System.out.print(v1+" ");
        }
        if(c2>n/3){ 
            System.out.print(v2);
        }
        s.close();
    }
}
