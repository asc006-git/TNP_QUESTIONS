import java.util.Scanner;
public class Rain{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] h=new int[n];
        System.out.print("Heights: ");
        for(int i=0;i<n;i++){
            h[i]=s.nextInt();
        }
        int l=0,r=n-1,leftmax=0,rightmax=0,res=0;
        while(l<=r){
            if(h[l]<=h[r]){
                if(h[l]>=leftmax){ 
                    leftmax=h[l];
                }
                else{ 
                    res+=leftmax-h[l];
                }
                l++;
            } 
            else {
                if(h[r]>=rightmax){ 
                    rightmax=h[r];
                }
                else{ 
                    res+=rightmax-h[r];
                }
                r--;
            }
        }
        System.out.print("Water: "+res);
        s.close();
    }
}
