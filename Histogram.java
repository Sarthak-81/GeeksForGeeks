import java.util.Scanner;
import java.util.Stack;

public class Histogram{

    // Function to find previous smaller element in an array. Returns index not value at that index.

    static int[] previousSmaller(int[] a){
        Stack<Integer> s = new Stack<>();
        int[] ps = new int [a.length];
        for(int i=0; i<a.length; i++){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i] = -1;
            }
            else{
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    static int[] nextSmaller(int[] a){
        Stack<Integer> s = new Stack<Integer>();
        int ns[] = new int[a.length];
        for(int i=a.length-1; i>=0; i--){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i] = a.length;
            }
            else{
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }
     static int getMaxArea(int hist[], int n) 
    {
        // your code here
         int ps[] = previousSmaller(hist);
        int ns[] = nextSmaller(hist);
        int maxarea = 0;
        for(int i=0; i<n; i++){
            int area = ((ns[i] - ps[i]) - 1) * hist[i];
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int k=0; k<array.length; k++){
            array[k] = sc.nextInt();
        }
        System.out.println(getMaxArea(array, num));
        sc.close();
    }
}