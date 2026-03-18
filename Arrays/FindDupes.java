import java.util.*;
public class FindDupes{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){ 
            a[i]=s.nextInt();
        }
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dupes=new HashSet<>();
        for(int x:a){
            if(!seen.add(x)){
                dupes.add(x);
            }
        }
        System.out.print("Duplicates: " + dupes);
        s.close();
    }
}
