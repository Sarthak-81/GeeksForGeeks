import java.util.Scanner;
// Kadane's Algorithm is an iterative dynamic programming algorithm. It calculates the maximum sum subarray ending 
// at a particular position by using the maximum sum subarray ending at the previous position.
class Kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
        sc.close();
    }
    

    static int maxSubArraySum(int a[]) {
        int maxSum=0;
        int curSum=0;
        for(int i=0; i<a.length; i++){
            curSum+=a[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }

        // this part is for when all the numbers are negative. 
        if(maxSum==0){
            int max = a[0];
            for(int j=0; j<a.length; j++){
                if(max<a[j]){
                    max = a[j];
                }
            }
            return max;
        }
        else{
            return maxSum;
        }
    }
}


















