import java.util.Currency;

public class Majority {

    static void majorElement(int array[], int size)
    {
        int ansIndex=0;
        int count = 1;
        for(int i=1; i<array.length; i++)
        {
            if(array[i]==array[ansIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ansIndex=i;
                count=1;
            }
        } 
        int freq = 0;
        for(int i=0; i<size; i++)
        {
            if(array[i]==array[ansIndex])
            {
                freq++;
            }
        } 
        if(freq>size/2)
        {
        System.out.println("Majority Element is " + array[ansIndex] + " and has a frequency of " + freq);
        }
        else
        {
            System.out.println("No majority element");
        }
    }

    public static void main(String args[]){
        int[] array = {1,5,7,5,2,5,5,5};
        int len = array.length;
        majorElement(array,len);
    }  
}
