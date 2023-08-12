import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraysEasy
{
   private static int largestElement(int[] arr, int n) {
       int max = Integer.MIN_VALUE;
       for (int i = 0 ; i < n ; i++){
           max = Math.max(arr[i], max);
       }
       return max;
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int temp[] = new int[2];
        for (int i = 0 ; i < n ; i++){
            max = Math.max(max , a[i]);
            min = Math.min(min , a[i]);
            if (a[i]<max){
                secondMax= Math.max(a[i] , secondMax);
            }
            if (a[i]>min){
                secondMin = Math.min(a[i], secondMin);
            }
        }
        temp[1] = secondMax;
        temp[2] = secondMin;
        return temp;

    }

    public static void reverseArray(int arr[] , int startingIndex , int lastIndex){
      while (startingIndex<lastIndex){
          int temp = arr[startingIndex];
          arr[startingIndex] = arr[lastIndex];
          arr[lastIndex] = temp;
          startingIndex++;
          lastIndex--;
      }

    }

    public static void rotateBydPlaces(int arr[] , int place){
       int n = arr.length;
       place = place%n;
       reverseArray(arr , 0 , place-1);
       reverseArray(arr , place , n-1);
       reverseArray(arr , 0 , n-1);
    }

    static int[] rotateArray(int[] arr, int n) {
   rotateBydPlaces(arr , 1);
   return arr;

    }


    public static int isSorted(int n, int []arr) {
        int low = 0;
        int high = n-1;
        int middle = (low+high)/2;
        int check = arr[middle];

        if(arr.length==1) return 1;
        for(int i = 0 ; i < middle ; i++){
            if(arr[i]<check)return 0;
        }
        for(int i = middle ; i < n ; i++){
            if(arr[i]<check) return 0;
        }
        return 1;
    }

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int check = arr.get(0);
        int count = 0;
        for (int i = 1; i < n ; i++ ){
            if (check == arr.get(i)) {count++;}
            else if(check!=arr.get(i)&&count==1){check = arr.get(i); count=1 ;}
            else  count++;
        }
        return count;
    }


    public static int[] moveZeros(int n, int []a) {
       int temp[] = new int[n];
       int count = 0;
       for (int i = 0 ; i < n ; i++){
           if (a[i]!=0){temp[count]= a[i] ; count++;}
       }
       while (count<n){
           temp[count++]=0;
       }
       return temp;
    }


    public static List< Integer > sortedArray(int []a, int []b) {
       int n = a.length;
       int m = b.length;

       ArrayList<Integer> list = new ArrayList<>();
       int i = 0;
       int j = 0;

       while ( i < n && j < m){
           if (a[i]<b[j]){
               list.add(a[i]);i++;
           }
           else if(a[i]>b[j]){
               list.add(b[j]);j++;
           }
           else {
               list.add(a[i++]);j++;
           }
       }
        //for left elements
        while (i <n){
            list.add(a[i++]);
        }
        while (j<m){
            list.add(b[j++]);
        }
        return list;
    }

    public static int missingNumber(int[] nums) {
       int n = nums.length;
       int requiredSum = 0;
       int missingSum = 0;
       for(int i = 0 ; i <=n ; i++){
           requiredSum+=i;
       }
       for (int i = 0 ; i < n ; i++){
           missingSum +=nums[i];
       }
       return requiredSum-missingSum;
    }


//    public static int getSingleElement(int []arr){
//       int n = arr.length;
//        HashMap<Integer , Integer> map = new HashMap<>();
//        int count = 1;
//        for (int i = 0 ; i < n ; i++){
//            if (arr[i])
//        }
//    }




    public static void main(String[] args) {


        //Largest Element in the Array

//        int arr[] = {1, 2 , 3 ,4, 5};
//        System.out.println(largestElement(arr, arr.length));

        //second largest and second smallest element

//        int arr[] = {1,2,3,9,5};
//        System.out.println(getSecondOrderElements( arr.length , arr));

        //check if the array is sorted return 1 if true else 0;
//        int arr[ ] = {1,2,3,4,5};
//        System.out.println(isSorted(arr.length , arr));

        //remove duplicates from sorted array
//        int arr[]={1 ,2 , 2 , 2 , 3};
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        System.out.println(removeDuplicates(list , list.size()));;

        //left rotate an array by n places
     //   int arr[] = {1,2,3,4,5};
//       reverseArray(arr, 0 , arr.length-1);
//        rotateBydPlaces(arr , 2);
//        System.out.println(Arrays.toString(arr));

      //  rotateArray(arr , arr.length);


        //find the union
        //given two sorted arrays  return  the union
//        int arr[] = {1,2,3,4,6};
//        int brr[] = {2,3,5};
        //expected output : {1,2,3,4,5,6};

       // System.out.println(sortedArray(arr , brr));

        //return the missing number
        //given array from range[0,n] with n distint elements , return the missing number
        int nums[] = {3,0,1};
        //Output: 2
      //  System.out.println(missingNumber(nums));

        //print the length of the longest subarray whose sum is k
        int arr[] = {1,2,3,1,1,1,1};
        //output : 3 as {1,1,1};

        //find the single element







    }
}
