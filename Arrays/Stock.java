import java.util.Scanner;
public class Stock{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Days: ");
        int n=s.nextInt();
        int[] p=new int[n];
        System.out.print("Prices: ");
        for(int i=0;i<n;i++){
            p[i]=s.nextInt();
        }
        int m=p[0],max=0;
        for(int x:p){
            if(x<m){ 
                m=x;
            }
            else if(x-m>max){ 
                max=x-m;
            }
        }
        System.out.print("Max Profit: "+max);
        s.close();
    }
}
