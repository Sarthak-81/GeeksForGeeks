public class Tower_of_Hanoi
// Time Complexity is O(2^n)
{ 
    static void towerOfHanoi(int disks, String source, String helper, String destination)
    {
        if(disks==1){
            System.out.println("transfer disk " + disks + " from " + source + " to " +  destination);
            return;
        }
        towerOfHanoi(disks-1, source, destination, helper);
        System.out.println("transfer disk " + disks + " from " + source + " to " +  destination);
        towerOfHanoi(disks-1, helper, source, destination);
    }
    public static void main(String args[]) 
    {
        int disks = 2;
        towerOfHanoi(disks, "Source", "Helper", "Destination");
    }
}
