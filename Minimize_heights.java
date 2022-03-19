import java.util.Arrays;
public class Minimize_heights {

    static int getMinDiff(int[] arr, int n, int k){
        int min=0,max=0,result=0;
        Arrays.sort(arr);
        result = arr[n-1] - arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>=k){
                max = Math.max(arr[i-1]+k, arr[n-1]-k);
                min = Math.min(arr[i]-k, arr[0]+k);
                result = Math.min(result, max-min);
            }
            else{
                continue;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int [] arr = {3,9,12,16,20};
        int n = arr.length;
        System.out.println(getMinDiff(arr, n, 3));
    }
}
