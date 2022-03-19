import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderArray{
    static ArrayList<Integer> leaders(int[] array){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=array.length-1; i>=0; i--){
            if(array[i]>=max){
                ans.add(array[i]);
                max = array[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = leaders(array);
        for(int i : ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
}