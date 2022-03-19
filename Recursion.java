// Program to reverse a String using recursion. 

// public class Recursion {

//     static void printReverse(String str, int index){
//         if(index==0){
//             System.out.print(str.charAt(index));
//             return;
//         }
//         System.out.print(str.charAt(index));
//         printReverse(str, index-1);
//     }
//     public static void main(String[] args){
//         String str = "Sarthak Goyal";
//         int len = str.length()-1;
//         printReverse(str, len);
//     }    
// }

// Find 1st and last Occurance of an element in a String.

// public class Recursion{

//     static int first = -1;
//     static int last = -1;
//     static void findOccurance(String str, int index, char element){
//         if(index==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(index);
//         if(currChar==element){
//             if(first==-1){
//                 first=index;
//             }else{
//                 last=index;
//             }
//         }
//         findOccurance(str, index+1, element);
//     }
//     public static void main(String[] args){
//         String str = "abaacasdadcv";
//         findOccurance(str, 0, 's');
//     }
// }

// Check if an Array is Sorted or not.

// public class Recursion{

//     static boolean isSorted(int[] array, int index){
//         if(index==array.length-1){
//             return true;
//         }
//         if(array[index]<array[index+1]){
//           return isSorted(array, index+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args){
//         int[] array = {7,7};
//         System.out.println(isSorted(array, 0));
//     }
// }
