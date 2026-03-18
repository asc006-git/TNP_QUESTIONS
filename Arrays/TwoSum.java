import java.util.*;
public class TwoSum{
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
        //Approach 1: Brute Force O(n^2)
        System.out.print("Brute: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==t){ 
                    System.out.print("["+i+","+j+"] ");
                }
            }
        }
        //Approach 2: Hash Map O(n)
        System.out.print("\nMap: ");
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int r=t-a[i];
            if(m.containsKey(r)){
                System.out.print("["+m.get(r)+","+i+"]");
                break;
            }
            m.put(a[i],i);
        }
        s.close();
    }
}
