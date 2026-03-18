import java.util.*;
public class stringcheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        //Approach 1:Frequency Array
        int[] freq=new int[256];
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)]++;
        }
        boolean possible1=true;
        int[] tempFreq=freq.clone();
        for(int i=0;i<s1.length();i++){
            if(--tempFreq[s1.charAt(i)]<0){
                possible1=false;
                break;
            }
        }
        System.out.println("Array Result: "+possible1);
        //Approach 2:HashMap
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean possible2=true;
        for(char c:s1.toCharArray()){
            if(map.getOrDefault(c,0)<=0){
                possible2=false;
                break;
            }
            map.put(c,map.get(c)-1);
        }
        System.out.println("HashMap Result: "+possible2);
        sc.close();
    }
}
